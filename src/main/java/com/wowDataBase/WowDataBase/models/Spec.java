package com.wowDataBase.WowDataBase.models;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@Table(name = "specs")
public class Spec {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @JoinColumn(name="class_id")
    @ManyToOne(fetch=EAGER)
    GameClass gameClass;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GameClass getGameClass() {
        return gameClass;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGameClass(GameClass gameClass) {
        this.gameClass = gameClass;
    }
}
