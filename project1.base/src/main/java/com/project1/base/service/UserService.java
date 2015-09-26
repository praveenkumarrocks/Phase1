package com.project1.base.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.base.model.User;
import com.project1.base.model.VerificationToken;
import com.project1.base.repository.UserRepository;
import com.project1.base.repository.VerificationTokenRepository;

@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    private UserRepository repository;
 
    @Autowired
    private VerificationTokenRepository tokenRepository;
 
    @Override
    public User getUser(String verificationToken) {
        User user = tokenRepository.findByToken(verificationToken).getUser();
        return user;
    }
     
    @Override
    public VerificationToken getVerificationToken(String VerificationToken) {
        return tokenRepository.findByToken(VerificationToken);
    }
     
    @Override
    public void saveRegisteredUser(User user) {
        repository.save(user);
    }
     
    @Override
    public void createVerificationToken(User user, String token) {
        VerificationToken myToken = new VerificationToken(token, user);
        tokenRepository.save(myToken);
    }
}
