package com.laundry.PBOmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    @Autowired
    public JavaMailSender mailSender;

    public void sendEmail(String toEmail,String subject,String body){

        SimpleMailMessage message = new SimpleMailMessage();
///set bellow with your email 
        message.setFrom("");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        System.out.println("email telah terkirim");

    }


}
