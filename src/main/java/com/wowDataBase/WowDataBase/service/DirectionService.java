package com.wowDataBase.WowDataBase.service;

import com.wowDataBase.WowDataBase.models.Direction;
import com.wowDataBase.WowDataBase.repository.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionService {
    @Autowired
    private DirectionRepository directionRepository;

    public List<Direction> getAllDirections() {
        return directionRepository.findAll();
    }

    public Direction saveDirection(Direction direction) {
        return directionRepository.save(direction);
    }
}
