package com.example.Drone.backend.service;
import com.example.Drone.backend.model.Session;
import com.example.Drone.backend.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    public void saveSession(Session session) {
        sessionRepository.save(session);
    }

    public void deleteAllSessions() {
        sessionRepository.deleteAll();
    }
}
