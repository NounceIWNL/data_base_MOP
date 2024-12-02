package com.wowDataBase.WowDataBase.controllers;

import com.wowDataBase.WowDataBase.models.GameClass;
import com.wowDataBase.WowDataBase.models.Tier;
import com.wowDataBase.WowDataBase.service.GameClassService;
import com.wowDataBase.WowDataBase.service.TierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiers")
public class TierController {
    @Autowired
    private TierService tierService;

    @GetMapping
    public List<Tier> getAllTiers() {
        List<Tier> tiers = tierService.getAllTiers();
        System.out.println(tiers.toString());
        return tiers;
    }

    @PostMapping
    public Tier createTier(@RequestBody Tier tier) {
        return tierService.saveTier(tier);
    }
}
