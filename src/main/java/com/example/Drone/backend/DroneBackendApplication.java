package com.example.Drone.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DroneBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroneBackendApplication.class, args);
	}

}
