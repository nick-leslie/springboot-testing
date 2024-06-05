package com.example.springboottesting.mapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class thoughtResponseVO extends thoughtVO{
    private String id;

    public thoughtResponseVO(String id,String posterId, String thought) {
        super(posterId, thought);
        this.id = id;
    }
}
