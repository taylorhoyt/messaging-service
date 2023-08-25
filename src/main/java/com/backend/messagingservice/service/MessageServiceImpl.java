package com.backend.messagingservice.service;

import com.backend.messagingservice.object.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private JavaMailSender messageSender;

    private SimpleMailMessage buildMessage(UserMessage rawMessage){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("{user email}");
        message.setTo("{email to send to}");
        message.setSubject("Message from " + rawMessage.getName());
        message.setText(rawMessage.getMessage() + "\n Sent on " + rawMessage.getDateAndTime());

        return message;
    }

    @Override
    public String send(UserMessage message){
        messageSender.send(buildMessage(message));
        return "Success\n" + message.toString();
    }
}