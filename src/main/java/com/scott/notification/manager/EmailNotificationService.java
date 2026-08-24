package com.scott.notification.manager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${email-settings.host}")
    private String host;

    @Value("${email-settings.port}")
    private int port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Email sent: ");
        System.out.println("message: " + message);
        System.out.println("recipientEmail: " + recipientEmail);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);

    }
}
