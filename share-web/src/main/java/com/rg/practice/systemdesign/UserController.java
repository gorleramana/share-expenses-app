/**
 * Social media system
 */
package com.rg.practice.systemdesign;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rg.web.repository.UserRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired private UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        // Validate & hash password before saving in producti       // return userRepository.save(user);
    	return null;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        //return userRepository.findById(id).orElseThrow();
    	return null;
    }
}
@Entity
class Follow {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User follower;
    @ManyToOne
    private User followee;
}
@Entity
class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String passwordHash;
    private String bio;
    private String avatarUrl;
    private LocalDateTime createdAt;
    // Getters & Setters
}

@Entity
class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private String content;
    private LocalDateTime createdAt;
    // Getters & Setters
}
