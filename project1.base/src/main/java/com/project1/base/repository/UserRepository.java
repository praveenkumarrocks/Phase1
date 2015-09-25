package com.project1.base.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project1.base.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("Select u from User u where LOWER(u.emailId) = LOWER(:emailId) and u.password = :password")
	public User getUser(@Param("emailId") String emailId, @Param("password") String password);
	
}
