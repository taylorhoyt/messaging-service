package com.backend.messagingservice.service;

import com.backend.messagingservice.object.UserMessage;

public interface MessageService {

    void send(UserMessage message);
}
