package com.example.Drone.backend.repository;

import com.example.Drone.backend.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepo extends JpaRepository<Session, Long> {
    // Custom query methods if needed
}
