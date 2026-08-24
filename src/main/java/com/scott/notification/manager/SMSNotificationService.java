package com.scott.notification.manager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService {

    @Value("${email-settings.host}")
    private String host;

    @Value("${email-settings.port}")
    private int port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("SMS Message sent: ");
        System.out.println("message: " + message);
        System.out.println("recipient email: "+recipientEmail);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);

    }
}
