package com.example.Drone.backend.repository;

import com.example.Drone.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Find user by username only
    User findByUsername(String username);
}
