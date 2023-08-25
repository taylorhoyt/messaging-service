package com.backend.messagingservice.object;

import lombok.Data;

@Data
public class UserMessage {
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String message;
}
