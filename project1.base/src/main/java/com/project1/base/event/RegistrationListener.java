package com.project1.base.event;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.project1.base.model.User;
import com.project1.base.service.IUserService;

@Component
public class RegistrationListener implements ApplicationListener<OnRegistrationCompleteEvent> {
	
    @Autowired
    private IUserService service;
    
    @Autowired
    private MessageSource messages;
    
    @Autowired
    private JavaMailSender mailSender;
 
    @Override
    public void onApplicationEvent(OnRegistrationCompleteEvent event) {
        this.confirmRegistration(event);
    }
 
    private void confirmRegistration(OnRegistrationCompleteEvent event) {
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        service.createVerificationToken(user, token);
         
        String recipientAddress = user.getEmailId();
        String subject = "Registration Confirmation";
        String confirmationUrl = event.getAppUrl() + "/regitrationConfirm.html?token=" + token;
        String message = "Dummy Message";
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message + " rn" + "http://localhost:8080" + confirmationUrl);
        //TODO : Need to fix this, unable to send emails using gmail. 
        //mailSender.send(email);
    }
}
