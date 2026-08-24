package com.scott.notification.manager;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {


    void save(User user);

    User findByEmail(String email);
}