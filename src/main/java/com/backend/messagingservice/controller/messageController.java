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
    @PostMapping(value = "message")
    public void sendMessage(@RequestBody UserMessage message){
        messageService.send(message);
    }
}

