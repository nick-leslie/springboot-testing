package com.example.springboottesting.mapper;

import com.example.springboottesting.models.user;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//todo lombok
@Getter
@Setter
@AllArgsConstructor
public class userVO  {
    private String name;

    public String getName() {
        return String.valueOf(name);
    }
}
