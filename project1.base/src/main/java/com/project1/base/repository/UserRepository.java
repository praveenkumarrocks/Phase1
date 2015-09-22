package com.project1.base.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project1.base.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("Select u from User u where LOWER(u.username) = LOWER(:username)")
	public User getUser(@Param("username") String username);
	
	@Query("Select u from User u where LOWER(u.username) = LOWER(:username) and u.password = :password")
	public User getUser(@Param("username") String username, @Param("password") String password);
	
}
