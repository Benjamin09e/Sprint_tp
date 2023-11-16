package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Personne;
import com.example.Service.PersonneService;

@RestController
public class PersonneController {
    
    @Autowired
    private PersonneService service;

    @PutMapping("/personne/{id}")
    public Personne updatePersonneById(Long id, Personne p){
        return service.updatePersonneById(id, p);
    }
    @PostMapping("/personne")
    public Personne savePersonne(@RequestBody Personne p) {
        return service.savePersonne(p);
    }

    @GetMapping("/personne")
    public List<Personne> getAllPersonnes() {
        return service.fetchAllPersonne();
    }

    @GetMapping("/personne/{id}")
    public Personne getPersonneById(Long id){
        return service.getPersonneById(id);
    }
}
