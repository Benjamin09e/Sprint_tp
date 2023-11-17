package com.example.Controller;

import com.example.Entity.Etudiant;
import com.example.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping("/creerEtudiant")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }
    @PostMapping("/update/{id}")
    public Etudiant updateEtudiant(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(id, etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteEtudiant(id);
    }
}
