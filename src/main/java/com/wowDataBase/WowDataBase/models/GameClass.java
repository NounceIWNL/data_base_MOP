package com.wowDataBase.WowDataBase.models;

import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class GameClass {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Getters and Setters
}
