package com.project1.base.service;

import com.project1.base.model.User;
import com.project1.base.model.VerificationToken;

public interface IUserService {
    
    User getUser(String verificationToken);
 
    void saveRegisteredUser(User user);
 
    void createVerificationToken(User user, String token);
 
    VerificationToken getVerificationToken(String VerificationToken);
}