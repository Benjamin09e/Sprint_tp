package com.example.Service;

import com.example.Entity.Etudiant;
import java.util.List;


public interface EtudiantService {

    List<Etudiant> getAllEtudiants();

    Etudiant getEtudiantById(Long id);

    Etudiant createEtudiant(Etudiant etudiant);

    Etudiant updateEtudiant(Long id, Etudiant etudiant);

    void deleteEtudiant(Long id);
}