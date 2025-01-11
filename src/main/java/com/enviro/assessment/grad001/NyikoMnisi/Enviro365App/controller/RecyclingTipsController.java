/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.controller;

/**
 *
 * @author Cash
 */

import com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.model.RecyclingTips;
import com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.service.RecyclingTipsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tips")
public class RecyclingTipsController {
    @Autowired
    private RecyclingTipsService service;

    @GetMapping
    public List<RecyclingTips> getAllTips() {
        return service.getAllTips();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecyclingTips> getTipById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getTipById(id));
    }

    @PostMapping
    public ResponseEntity<RecyclingTips> createTip(@Valid @RequestBody RecyclingTips tip) {
        return ResponseEntity.ok(service.saveTip(tip));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTip(@PathVariable Long id) {
        service.deleteTip(id);
        return ResponseEntity.noContent().build();
    }
}
