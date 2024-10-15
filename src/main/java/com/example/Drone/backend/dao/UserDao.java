package com.example.Drone.backend.dao;

import com.example.Drone.backend.model.User;
import com.example.Drone.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private UserRepository userRepository;

    public User getUserByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsername(username);
    }
}
