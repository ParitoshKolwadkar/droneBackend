package com.example.Drone.backend.service;

import com.example.Drone.backend.model.User;
import com.example.Drone.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;



    public User validateUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
