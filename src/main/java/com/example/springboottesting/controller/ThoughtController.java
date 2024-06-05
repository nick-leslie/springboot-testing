package com.example.springboottesting.controller;

import com.example.springboottesting.mapper.thoughtVO;
import com.example.springboottesting.mapper.userVO;
import com.example.springboottesting.models.thought;
import com.example.springboottesting.models.user;
import com.example.springboottesting.service.userService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/thought")
@RequiredArgsConstructor
public class ThoughtController {

    private final com.example.springboottesting.service.thoughtService thoughtService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<thought> GetThoughts() {
        return thoughtService.getAll();
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public thought PostUser(@RequestBody thoughtVO thoughtVO) {
        return thoughtService.createThought(thoughtVO);
    }
}
