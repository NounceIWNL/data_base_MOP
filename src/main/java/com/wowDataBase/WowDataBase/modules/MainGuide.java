package com.wowDataBase.WowDataBase.modules;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "main_guides")
public class MainGuide {
    @Id
    @GeneratedValue
    private Long id;
    private String content;


    @JoinColumn(name = "spec_id")
    @ManyToOne(fetch=LAZY)
    Spec spec;


    @JoinColumn(name = "direction_id")
    @ManyToOne(fetch=LAZY)
    Direction direction;


    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Spec getSpec() {
        return spec;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
