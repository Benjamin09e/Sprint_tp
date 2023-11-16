package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Professeur;
import com.example.Service.ProfesseurService;

@RestController
public class ProfesseurController {
    @Autowired
    private ProfesseurService service;

    @PutMapping("/professeur/{id}")
    public Professeur updateProfesseurById(@PathVariable("id") Long id,@RequestBody Professeur p){
        return service.updateProfesseurById(id, p);
    }
    @PostMapping("/professeur")
    public Professeur saveProfesseur(@RequestBody Professeur p) {
        return service.saveProfesseur(p);
    }

    @GetMapping("/professeur")
    public List<Professeur> getAllProfesseurs() {
        return service.fetchAllProfesseur();
    }

    @GetMapping("/professeur/{id}")
    public Professeur getProfesseurById(@PathVariable("id") Long id){
        return service.getProfesseurById(id);
    }

    @DeleteMapping("/professeur/{id}")
    public String deleteProfesseur(@PathVariable("id") Long id) {
        return service.deleteProfesseur(id);
    }
}
