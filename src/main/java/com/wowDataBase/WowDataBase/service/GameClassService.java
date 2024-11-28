package com.wowDataBase.WowDataBase.service;


import com.wowDataBase.WowDataBase.models.GameClass;
import com.wowDataBase.WowDataBase.repository.GameClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameClassService {
    @Autowired
    private GameClassRepository gameClassRepository;

    public List<GameClass> getAllGameClasses() {
        return gameClassRepository.findAll();
    }

    public GameClass saveGameClass(GameClass gameClass) {
        return gameClassRepository.save(gameClass);
    }
}