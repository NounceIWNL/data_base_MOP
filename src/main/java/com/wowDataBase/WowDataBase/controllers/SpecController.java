package com.wowDataBase.WowDataBase.controllers;

import com.wowDataBase.WowDataBase.models.GameClass;
import com.wowDataBase.WowDataBase.models.Spec;
import com.wowDataBase.WowDataBase.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specs")
public class SpecController {
    @Autowired
    private SpecService specService;

    @GetMapping
    public List<Spec> getAllSpecs(){
        List<Spec> specs = specService.getAllSpecs();
        System.out.println(specs.toString());
        return specs;
    }

    @PostMapping
    public Spec createSpec(@RequestBody Spec spec) {
        return specService.saveSpec(spec);
    }
}