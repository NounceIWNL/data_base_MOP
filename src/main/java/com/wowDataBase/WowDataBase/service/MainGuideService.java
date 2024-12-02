package com.wowDataBase.WowDataBase.service;

import com.wowDataBase.WowDataBase.models.MainGuide;
import com.wowDataBase.WowDataBase.repository.MainGuideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainGuideService {
    @Autowired
    private MainGuideRepository mainGuideRepository;

    public List<MainGuide> getAllMainGuides(){
        return mainGuideRepository.findAll();
    }

    public MainGuide saveMainGuide (MainGuide mainGuide) {
        return mainGuideRepository.save(mainGuide);
    }
}
