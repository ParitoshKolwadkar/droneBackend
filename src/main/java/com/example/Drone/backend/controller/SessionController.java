package com.example.Drone.backend.controller;

import com.example.Drone.backend.model.Session;
import com.example.Drone.backend.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    // Endpoint to get all sessions
    @GetMapping("/sessions")
    public List<Session> getOldSessions() {
        return sessionService.getOldSessions();
    }

    // Endpoint to add a new session
    @PostMapping("/sessions")
    public Session addSession(@RequestBody Session session) {
        return sessionService.addSession(session);
    }

    // Endpoint to get a session by ID
    @GetMapping("/sessions/{id}")
    public Session getSessionById(@PathVariable Long id) {
        return sessionService.getSessionById(id);
    }
}
