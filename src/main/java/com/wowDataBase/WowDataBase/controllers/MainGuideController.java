package com.wowDataBase.WowDataBase.controllers;

import com.sun.tools.javac.Main;
import com.wowDataBase.WowDataBase.models.MainGuide;
import com.wowDataBase.WowDataBase.service.MainGuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mainGuides")
public class MainGuideController {
    @Autowired
    private MainGuideService mainGuideService;

    @GetMapping
    public List<MainGuide> getAllMainGuides(){
        List<MainGuide> mainGuides = mainGuideService.getAllMainGuides();
        System.out.println(mainGuides.toString());
        return mainGuides;
    }

    @PostMapping
    public MainGuide createMainGuide(@RequestBody MainGuide mainGuide){
        return mainGuideService.saveMainGuide(mainGuide);
    }
}
