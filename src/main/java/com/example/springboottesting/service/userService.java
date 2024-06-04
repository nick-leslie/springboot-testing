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

    public Iterable<user> getUser() {
        return userRepo.findAll();
    }

    public user createUser(userVO userInput) {
        user user = new user(UUID.randomUUID().toString(),userInput.getName());
        userRepo.save(user);
        return user;
    }
}
