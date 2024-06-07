package com.example.springboottesting.controller;

import com.example.springboottesting.mapper.thoughtResponseVO;
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

import java.util.List;

@RestController
@RequestMapping("/api/thought")
@RequiredArgsConstructor
public class ThoughtController {

    private final com.example.springboottesting.service.thoughtService thoughtService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Iterable<thoughtResponseVO> GetThoughts() {
        List<thoughtResponseVO> thoughts = thoughtService.getAll().stream().map(idea -> new thoughtResponseVO(idea.getId(),idea.getUser().id,idea.getThought())).toList();
        return thoughts;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public thoughtResponseVO PostUser(@RequestBody thoughtVO thoughtVO) {
        thought idea = thoughtService.createThought(thoughtVO);
        return new thoughtResponseVO(idea.getId(),idea.getUser().id,idea.getThought());
    }
}
