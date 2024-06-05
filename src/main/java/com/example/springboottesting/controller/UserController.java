package com.example.springboottesting.controller;

import com.example.springboottesting.mapper.userVO;
import com.example.springboottesting.models.user;
import com.example.springboottesting.service.userService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController  {

    private final userService userService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Iterable<user> GetUser() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public user PostUser(@RequestBody userVO user) {
        System.out.println(user);
        return userService.createUser(user);
    }
}
