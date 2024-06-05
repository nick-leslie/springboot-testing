package com.example.springboottesting.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class thought {
    @Id
    private String id;
    private String thought;
    @OneToOne
    private user user;

    public thought(String id, String thought) {
        this.id = id;
        this.thought = thought;
    }
}
