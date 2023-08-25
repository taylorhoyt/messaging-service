package com.backend.messagingservice.service;

import com.backend.messagingservice.object.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private JavaMailSender messageSender;

    @Autowired
    private Environment environment;

    private SimpleMailMessage buildMessage(UserMessage rawMessage){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(environment.getProperty("backend.messagingservice.sendFrom"));
        message.setTo(environment.getProperty("backend.messagingservice.sendTo"));
        message.setSubject("Message from " + rawMessage.getName());
        message.setText(rawMessage.getMessage() +
                "\nContact Info:" +
                "\n\n" + rawMessage.getEmailAddress() +
                "\n" + rawMessage.getPhoneNumber() +
                "\nSent on " + LocalDate.now() + " at " + LocalTime.now());

        return message;
    }

    @Override
    public String send(UserMessage message){
        messageSender.send(buildMessage(message));
        return "Success\n" + message.toString();
    }
}