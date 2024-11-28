package com.wowDataBase.WowDataBase.models;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "tiers")
public class Tier {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @JoinColumn(name="direction_id")
    @ManyToOne(fetch=LAZY)
    Direction direction;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
