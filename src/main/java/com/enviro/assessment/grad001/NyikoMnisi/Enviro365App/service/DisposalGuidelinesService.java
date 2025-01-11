/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.service;

/**
 *
 * @author Cash
 */

import com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.model.DisposalGuidelines;
import com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.repository.DisposalGuidelinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisposalGuidelinesService {
    @Autowired
    private DisposalGuidelinesRepository repository;

    public List<DisposalGuidelines> getAllGuidelines() {
        return repository.findAll();
    }

    public DisposalGuidelines getGuidelineById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Guideline not found"));
    }

    public DisposalGuidelines saveGuideline(DisposalGuidelines guideline) {
        return repository.save(guideline);
    }

    public void deleteGuideline(Long id) {
        repository.deleteById(id);
    }
}

