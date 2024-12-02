package com.wowDataBase.WowDataBase.controllers;

import com.wowDataBase.WowDataBase.models.Direction;
import com.wowDataBase.WowDataBase.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directions")
public class DirectionController {
    @Autowired
    private DirectionService directionService;

    @GetMapping
    public List<Direction> getAllDirections() {
        List<Direction> directions = directionService.getAllDirections();
        System.out.println(directions.toString());
        return directions;
    }

    @PostMapping
    public Direction createDirection(@RequestBody Direction direction) {
        return directionService.saveDirection(direction);
    }
}
