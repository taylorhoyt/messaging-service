package com.backend.messagingservice.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@NoArgsConstructor
@Getter
@Configuration
public class MailConfig {

    @Value("{spring.mail.host}")
    private String host;
    @Value("{spring.mail.port}")
    private String port;
    @Value("{spring.mail.username}")
    private String username;
    @Value("{spring.mail.password}")
    private String password;

}
