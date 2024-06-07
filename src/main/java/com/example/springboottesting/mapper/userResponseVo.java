package com.example.springboottesting.mapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class userResponseVo extends userVO {
    private String id;

    public userResponseVo(String id,String name) {
        super(name);
        this.id = id;
    }
}
