package com.scott.notification.manager;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository {

    //HashMap object of MyUsers
    private Map<String, User> usersRegistered = new HashMap<>();

    public void save(User myUser) {

        System.out.println("Saving: user: " + myUser);

        usersRegistered.put(myUser.getEmail(), myUser);
        System.out.println(usersRegistered);

    }

    @Override
    public User findByEmail(String email) {
        return usersRegistered.getOrDefault(email, null);
    }


}



