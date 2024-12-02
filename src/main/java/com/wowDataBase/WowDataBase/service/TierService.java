package com.wowDataBase.WowDataBase.service;

import com.wowDataBase.WowDataBase.models.GameClass;
import com.wowDataBase.WowDataBase.models.Tier;
import com.wowDataBase.WowDataBase.repository.GameClassRepository;
import com.wowDataBase.WowDataBase.repository.TierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TierService {
    @Autowired
    private TierRepository tierRepository;

    public List<Tier> getAllTiers() {
        return tierRepository.findAll();
    }

    public Tier saveTier(Tier tier) {
        return tierRepository.save(tier);
    }
}