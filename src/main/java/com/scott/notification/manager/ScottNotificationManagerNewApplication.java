package com.scott.notification.manager;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScottNotificationManagerNewApplication {

    public static void main(String[] args) throws
                                           IllegalArgumentException {


//        ApplicationContext context = SpringApplication.run(ScottNotificationManagerNewApplication.class, args);
//
//
//        UserService userService = context.getBean(UserService.class);
//
//        userService.registerUser(new User(1, "ScottMichaelAnderson8418@gmail.com", "Scott Anderson", "Five2OneA"));
//        userService.registerUser(new User(2, "PeterGibbons69@gmail.com", "Peter Gibbons", "Five2OneB"));


//        SpringApplication.run(ScottNotificationManagerNewApplication.class, args);

        User user = User.builder()
                .name("John")
                .password("password")
                .email("john@codewithmosh.com")
                .build();

        Address address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zip")
                .build();


//this is how to wire these objects together
// now the user knows about the address object
//        user.getAddresses()
//                .add(address);
        //Now the address knows about the user object
//        address.setUser(user);

//
//        user.addAddress(address);
//        System.out.println(user);

//
        Tag tag = new Tag("tag1");

        user.getTags()
                .add(tag);
        tag.getUsers()
                .add(user);

//        System.out.println(tag.toString());
//        System.out.println(user.toString());


        Profile profile = Profile.builder()
                .bio("bio")
                .build();

        user.setProfile(profile);
        profile.setUser(user);
        System.out.println(user);
    }

}
