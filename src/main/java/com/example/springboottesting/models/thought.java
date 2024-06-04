package com.example.springboottesting.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class thought {
    @Id
    @GeneratedValue
    private long id;

    private String posterName;
    private String thought;
}
