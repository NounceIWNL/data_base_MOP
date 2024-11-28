package com.wowDataBase.WowDataBase.controllers;

import com.wowDataBase.WowDataBase.models.GameClass;
import com.wowDataBase.WowDataBase.service.GameClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/gameClasses")
public class GameClassController {
    @Autowired
    private GameClassService gameClassService;

    @GetMapping
    public List<GameClass> getAllGameClasses() {
        List<GameClass> gameClasses = gameClassService.getAllGameClasses();
        System.out.println(gameClasses.toString());
        return gameClasses;
    }

    @PostMapping
    public GameClass createGameClass(@RequestBody GameClass gameClass) {
        return gameClassService.saveGameClass(gameClass);
    }
}