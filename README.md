# messaging-service
Backend messaging service for sending email using SMTP

Uses Java 17, Spring Boot 3.1.3, Lombok, and Maven.
This service is mostly pre-configured to work with Gmail SMTP.

### Endpoint:
POST ```/v1/message```

#### Example payload:
```
{
"name" : "John Doe",
"emailAddress" : "johndoe@emailprovider.com",
"phoneNumber" : "(123)456-7890
"message" : "Hello, I have some questions about your services",
}
```

## Run

To run, first update the application.properties file with the proper credentials.
Once updated, use the command: $ mvn spring-boot:run
