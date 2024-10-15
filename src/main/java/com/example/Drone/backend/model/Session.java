package com.example.Drone.backend.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Sessions") // Maps to the 'Sessions' table in the database
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "session_name", nullable = false)
    private String sessionName;

    @Column(name = "session_date", nullable = false)
    @Temporal(TemporalType.DATE) // Ensures the sessionDate is stored as a DATE (not TIMESTAMP)
    private Date sessionDate;

    @Column(name = "location", nullable = false)
    private String location;

    // Constructors, Getters, and Setters

    public Session() {
    }

    public Session(String sessionName, Date sessionDate, String location) {
        this.sessionName = sessionName;
        this.sessionDate = sessionDate;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
