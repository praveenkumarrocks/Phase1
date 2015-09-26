package com.project1.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.base.model.User;
import com.project1.base.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
	 
    VerificationToken findByToken(String token);
 
    VerificationToken findByUser(User user);
}
