package com.project1.base.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@PropertySource("classpath:local-config.properties")
@Configuration
@EnableJpaRepositories(basePackages = "com.project1.base.repository")
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setViewClass(JstlView.class);
		internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}

	@Bean
	protected DataSource dataSource(Environment environment) throws Exception {
		DataSource dataSource = getDataSourceFromJNDI(environment);
		if(dataSource == null) {
			dataSource = createDatasourceFromEnviromentProperties(environment);
		}
		return dataSource;
	}
	
	protected DataSource getDataSourceFromJNDI(Environment environment) {
		String jndiDatasource = environment.getProperty("jndi.datasource");
		if (jndiDatasource == null) {
			return null;
		}
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		DataSource dataSource = dsLookup.getDataSource(jndiDatasource);
		return dataSource;
	}
	
	protected DataSource createDatasourceFromEnviromentProperties(Environment environment) {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("org.postgresql.Driver");
		basicDataSource.setPassword("postgres");
		basicDataSource.setUrl("jdbc:postgresql://localhost:5432/project1");
		basicDataSource.setUsername("postgres");
		basicDataSource.setInitialSize(20);
		basicDataSource.setMaxActive(200);
		basicDataSource.setMaxIdle(5);
		basicDataSource.setValidationQuery("SELECT 1");
		basicDataSource.setMinEvictableIdleTimeMillis(30000);

		return basicDataSource;
	}
	
	@Bean(name = "entityManagerFactory")
	protected LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(DataSource dataSource, Environment env) throws Exception {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource);
		em.setPackagesToScan(new String[] { "com.project1.base.model" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);

		em.setJpaProperties(this.additionalProperties(env));
		return em;
	}
	
	protected Properties additionalProperties(Environment environment) {
		Properties properties = new Properties();
		if (StringUtils.isNotEmpty(environment.getProperty("recreate.database")) && "true".equalsIgnoreCase(environment.getProperty("recreate.database"))) {
			properties.setProperty(org.hibernate.cfg.Environment.HBM2DDL_AUTO, "create");
		} else {
			properties.setProperty(org.hibernate.cfg.Environment.HBM2DDL_AUTO, "update");
		}
		properties.setProperty(org.hibernate.cfg.Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		properties.setProperty(org.hibernate.cfg.Environment.SHOW_SQL, "false");
		properties.setProperty("hibernate.connection.CharSet", "utf8");
		properties.setProperty("hibernate.connection.characterEncoding", "utf8");
		properties.setProperty("hibernate.connection.useUnicode", "true");
		return properties;
	}
	
	@Bean
	protected PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) throws Exception {
		return new JpaTransactionManager(entityManagerFactory);
	}
	
}