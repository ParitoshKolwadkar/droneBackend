package com.example.Drone.backend.repository;

import com.example.Drone.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query to find a user by username and password
    User findByUsernameAndPassword(String username, String password);
}
