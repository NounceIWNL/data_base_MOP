package com.wowDataBase.WowDataBase.service;

import com.wowDataBase.WowDataBase.models.Spec;
import com.wowDataBase.WowDataBase.repository.SpecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecService {
    @Autowired
    private SpecRepository specRepository;

    public List<Spec> getAllSpecs() {
        return specRepository.findAll();
    }

    public Spec saveSpec(Spec spec) {
        return specRepository.save(spec);
    }
}
