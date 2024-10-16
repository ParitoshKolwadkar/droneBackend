package com.example.Drone.backend.controller;

import com.example.Drone.backend.model.User;
import com.example.Drone.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/checkLogin")
    public ResponseEntity<?> checkLogin(@RequestBody User user) {
        User foundUser = loginService.validateUser(user.getUsername(), user.getPassword());

        if (foundUser != null) {
            return ResponseEntity.ok().body("Login Successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

        @PostMapping("/register")
        public ResponseEntity<?> registerUser(@RequestBody User user) {
            User registeredUser = loginService.registerUser(user);
            return ResponseEntity.ok().body("User registered successfully");
        }
}

