/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.controller;

/**
 *
 * @author Cash
 */

import com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.model.DisposalGuidelines;
import com.enviro.assessment.grad001.NyikoMnisi.Enviro365App.service.DisposalGuidelinesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guidelines")
public class DisposalGuidelinesController {
    @Autowired
    private DisposalGuidelinesService service;

    @GetMapping
    public List<DisposalGuidelines> getAllGuidelines() {
        return service.getAllGuidelines();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> getGuidelineById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getGuidelineById(id));
    }

    @PostMapping
    public ResponseEntity<DisposalGuidelines> createGuideline(@Valid @RequestBody DisposalGuidelines guideline) {
        return ResponseEntity.ok(service.saveGuideline(guideline));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuideline(@PathVariable Long id) {
        service.deleteGuideline(id);
        return ResponseEntity.noContent().build();
    }
}

