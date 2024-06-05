package com.example.springboottesting.mapper;

import com.example.springboottesting.models.user;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//todo lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class userVO  {
    public String name;

    public String getName() {
        return String.valueOf(name);
    }
}
