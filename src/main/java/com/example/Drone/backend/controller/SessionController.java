package com.example.Drone.backend.controller;

import com.example.Drone.backend.model.Session;
import com.example.Drone.backend.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/getSessions")
    public List<Session> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @PostMapping("/setSessions")
    public ResponseEntity<?> addSession(@RequestBody Session session) {
        sessionService.saveSession(session);
        return ResponseEntity.ok("Session saved successfully.");
    }

    @DeleteMapping("/deleteAllSessions")
    public String deleteAllSessions() {
        try {
            sessionService.deleteAllSessions();
            return "All sessions have been deleted successfully!";
        } catch (Exception e) {
            return "Error deleting sessions: " + e.getMessage();
        }
    }
}
