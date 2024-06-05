package com.example.springboottesting.service;

import com.example.springboottesting.mapper.userVO;
import com.example.springboottesting.models.user;
import com.example.springboottesting.repositories.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
// this is were the large amount of the work will take place
@Service
@RequiredArgsConstructor
//todo use lombok for required args constructor
public class userService {

    private final userRepository userRepo;

    public Iterable<user> getUsers() {
        return userRepo.findAll();
    }
    public user getUserByName(String username) {
        return userRepo.findByUsername(username);
    }
    public user getUserById(String id) {
        return userRepo.findByUsername(id);
    }
    public user createUser() {
        //TODO replace with random name gen
        user user = new user(UUID.randomUUID().toString(),UUID.randomUUID().toString());
        userRepo.save(user);
        return user;
    }
    public user createUser(userVO userInput) {
        user user = new user(UUID.randomUUID().toString(),userInput.getName());
        userRepo.save(user);
        return user;
    }
}
