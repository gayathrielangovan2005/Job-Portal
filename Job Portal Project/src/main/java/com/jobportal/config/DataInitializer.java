package com.jobportal.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.jobportal.model.User;
import com.jobportal.repository.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        try {
            // Create default admin user if not exists
            if (!userRepository.findByEmail("admin@jobportal.com").isPresent()) {
                User admin = new User();
                admin.setEmail("admin@jobportal.com");
                admin.setPassword(passwordEncoder.encode("admin123")); // Changed to 8 characters
                admin.setRole("ADMIN");
                admin.setFirstName("Admin");
                admin.setLastName("User");
                userRepository.save(admin);
                logger.info("Default admin user created successfully");
            } else {
                logger.info("Admin user already exists");
            }
        } catch (Exception e) {
            logger.error("Error creating admin user: " + e.getMessage(), e);
        }
    }
} 