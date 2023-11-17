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

import com.example.Entity.Classe;
import com.example.Service.ClasseService;


@RestController
public class ClasseController {
    
    @Autowired
    private ClasseService service;

    @PutMapping("/classe/{id}")
    public Classe updateClasseById(@PathVariable("id") Long id,@RequestBody Classe p){
        return service.updateClasseById(id, p);
    }
    @PostMapping("/classe/{id}")
    public Classe saveClasse(@RequestBody Classe p, @PathVariable("id") Long id) {
        return service.saveClasse(p,id);
    }

    @GetMapping("/classe")
    public List<Classe> getAllClasses() {
        return service.fetchAllClasse();
    }

    @GetMapping("/classe/{id}")
    public Classe getClasseById(@PathVariable("id") Long id){
        return service.getClasseById(id);
    }

    @DeleteMapping("/classe/{id}")
    public String deleteClasse(@PathVariable("id") Long id) {
        return service.deleteClasse(id);
    }
}
