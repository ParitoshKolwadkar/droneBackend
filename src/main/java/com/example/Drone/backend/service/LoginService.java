package com.example.Drone.backend.service;

import com.example.Drone.backend.model.User;
import com.example.Drone.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private StringHttpMessageConverter stringHttpMessageConverter;

    public User validateUser(String username, String password) {
            User foundUser = userRepository.findByUsername(username);
            if(foundUser!= null && passwordEncoder.matches(password, foundUser.getPassword())) {
                return foundUser;
            }
            else {
                return null;
            }
    }

    public User registerUser(User user) {
        // Encrypt the password before saving
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }
}
