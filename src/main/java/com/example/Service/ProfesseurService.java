package com.example.Service;

import java.util.List;

import com.example.Entity.Professeur;

public interface ProfesseurService {

    Professeur saveProfesseur(Professeur p);

    List<Professeur> fetchAllProfesseur();

    Professeur getProfesseurById(Long id);

    Professeur updateProfesseurById(Long id, Professeur p);

    String deleteProfesseur(Long id);
}
