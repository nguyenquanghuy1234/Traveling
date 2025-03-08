package com.mycompany.traveling.service;

import org.springframework.stereotype.Service;

import com.mycompany.traveling.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void printAll() {
        userRepository.findAll();
    }
}
