package com.example.springboottesting.models;



import jakarta.persistence.*;


import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
public class user implements Serializable {
    @Id
    @GeneratedValue
    public String id;
    public String name;
    @OneToMany
    private List<thought> thoughts;

    public user(String id, String name) {
        this.name = name;
    }

    public user() {
        this.name = "testing";
    }
}