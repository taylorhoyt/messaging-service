package com.backend.messagingservice.service;

import com.backend.messagingservice.object.UserMessage;

public interface MessageService {

    String send(UserMessage message);
}
