package com.scott.notification.manager;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    private NotificationService notificationService;


    private List<User> myUserList = new ArrayList<>();

    //constructor
    public UserService(UserRepository userRepository, @Qualifier("email") NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    //registerUser method to input users
    public void registerUser(User user) {

        if (userRepository.findByEmail(user.getEmail()) != null) {

            throw new IllegalArgumentException("User with email " + user.getEmail() + "already exists.........");

        }
        userRepository.save(user);

        notificationService.send("You are registered successfully", user.getEmail());


    }

}
