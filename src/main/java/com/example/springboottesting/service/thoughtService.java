package com.example.springboottesting.service;

import com.example.springboottesting.mapper.thoughtVO;
import com.example.springboottesting.models.thought;
import com.example.springboottesting.models.user;
import com.example.springboottesting.repositories.thoughtRepository;
import com.example.springboottesting.repositories.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class thoughtService {
    private final thoughtRepository thoughtRepo;
    private final userService userService;


    public List<thought> getAll() {
        return thoughtRepo.findAll();
    }


    public thought createThought(thoughtVO thoughtVO) {
        // checks if user exists if it doesn't then we create a new user with a random name
        user poster = userService.getUserByName(thoughtVO.getPosterId());
        if(poster==null) {
            poster = userService.createUser();
        }
        return new thought(UUID.randomUUID().toString() ,thoughtVO.getThought(),poster);
    }
}
