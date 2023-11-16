package com.example.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Personne;
import com.example.Entity.Professeur;
import com.example.Repository.ProfesseurRepository;

@Service
public class ProfesseurImpl implements ProfesseurService{

    @Autowired
    private ProfesseurRepository professeurRepository;

    @Override
    public Professeur saveProfesseur(Professeur p) {
        return professeurRepository.save(p);
    }

    @Override
    public List<Professeur> fetchAllProfesseur() {
       List<Professeur> allProfs = professeurRepository.findAll();
        return allProfs;
    }

    @Override
    public Professeur getProfesseurById(Long id) {
        Optional<Professeur> prof = professeurRepository.findById(id);
        if (prof.isPresent()) {
            return prof.get();
        }
        return null;
    }

    @Override
    public Professeur updateProfesseurById(Long id, Professeur p) {
        Optional<Professeur> prof = professeurRepository.findById(id);

        if (prof.isPresent()) {
            Professeur originalProfesseur = prof.get();

            if (Objects.nonNull(prof.get().getSubject()) && !"".equalsIgnoreCase(p.getSubject())) {
                originalProfesseur.setSubject(p.getSubject());
            }
            return professeurRepository.save(originalProfesseur);
        }
        return null;
    }

    @Override
    public String deleteProfesseur(Long id) {
        if (professeurRepository.findById(id).isPresent()) {
            professeurRepository.deleteById(id);
            return "Professor deleted successfully";
        }
        return "No such Professeur in the database";
    }
    

}
