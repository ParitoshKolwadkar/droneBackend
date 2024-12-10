package com.example.Drone.backend.dao;
import com.example.Drone.backend.model.Session;
import com.example.Drone.backend.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SessionDAO {

    @Autowired
    private SessionRepository sessionRepository;

    public List<Session> fetchAllSessions() {
        return sessionRepository.findAll();
    }

    public void saveSession(Session session) {
        sessionRepository.save(session);
    }
}
