package com.example.Drone.backend.service;

import com.example.Drone.backend.model.Session;
import com.example.Drone.backend.repository.SessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepo sessionRepo;

    // Fetch all sessions
    public List<Session> getOldSessions() {
        return sessionRepo.findAll(); // Retrieves all sessions from the 'Sessions' table
    }

    // Add a new session
    public Session addSession(Session session) {
        return sessionRepo.save(session); // Saves a new session
    }

    // Get session by ID
    public Session getSessionById(Long id) {
        return sessionRepo.findById(id).orElse(null); // Retrieves session by ID
    }

    // Optional: Additional methods for filtering or finding specific sessions by name, date, etc.
}
