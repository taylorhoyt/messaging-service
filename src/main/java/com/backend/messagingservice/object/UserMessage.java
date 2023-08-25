package com.backend.messagingservice.object;

import lombok.Data;

@Data
public class UserMessage {
    private String name;
    private String emailAddress;
    private String message;
    private String dateAndTime;
}
