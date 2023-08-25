package com.backend.messagingservice.controller;

import com.backend.messagingservice.object.UserMessage;
import com.backend.messagingservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1")
public class messageController {
    @Autowired
    private MessageService messageService;
    @RequestMapping(value = "message", produces="application/json")
    public String sendMessage(@RequestBody UserMessage message){
        return messageService.send(message);
    }
}

