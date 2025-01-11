/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.service;

/**
 *
 * @author Cash
 */

import com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.model.RecyclingTips;
import com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.repository.RecyclingTipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecyclingTipsService {
    @Autowired
    private RecyclingTipsRepository repository;

    public List<RecyclingTips> getAllTips() {
        return repository.findAll();
    }

    public RecyclingTips getTipById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Tip not found"));
    }

    public RecyclingTips saveTip(RecyclingTips tip) {
        return repository.save(tip);
    }

    public void deleteTip(Long id) {
        repository.deleteById(id);
    }
}
