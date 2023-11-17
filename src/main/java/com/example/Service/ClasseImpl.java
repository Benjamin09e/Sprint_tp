package com.example.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Classe;
import com.example.Entity.Etudiant;
import com.example.Entity.Professeur;
import com.example.Repository.ClasseRepository;


 @Service
public class ClasseImpl implements ClasseService{


    @Autowired
    private ClasseRepository classeRepository;

    @Autowired
    ProfesseurImpl profservice;

    @Override
    public Classe saveClasse(Classe p,Long id) {
        Professeur prof=new Professeur();
       if (profservice.getProfesseurById(id)!=null){
           prof= profservice.getProfesseurById(id);
       }
        p.setProf(prof);
        return classeRepository.save(p);
    }

    @Override
    public List<Classe> fetchAllClasse() {
        List<Classe> allClasses = classeRepository.findAll();
        return allClasses;
    }

    @Override
    public Classe getClasseById(Long id) {
       Optional<Classe> classe = classeRepository.findById(id);
        if (classe.isPresent()) {
            return classe.get();
        }
        return null;
    }

    @Override
    public Classe updateClasseById(Long id, Classe p) {
        Optional<Classe> classe = classeRepository.findById(id);
        

        if (classe.isPresent()) {
            Classe originalclasse = classe.get();

            if (Objects.nonNull(classe.get().getMax()) && p.getMax()!=0) {
                originalclasse.setMax(p.getMax());
            }
            if (Objects.nonNull(classe.get().getName()) && !"".equalsIgnoreCase(p.getName())) {
                originalclasse.setName(p.getName());
            }
            if(Objects.nonNull(classe.get().getEtudiant())) {
                originalclasse.setEtudiant(classe.get().getEtudiant());
            }
            if (Objects.nonNull(classe.get().getProf().getId()) && profservice.getProfesseurById(p.getProf().getId())!=null) {
                originalclasse.setProf(profservice.getProfesseurById(p.getProf().getId()));
            }
            
            return classeRepository.save(originalclasse);
        }
        return null;
    }
    
    @Override
    public String deleteClasse(Long id) {
        if (classeRepository.findById(id).isPresent()) {
            classeRepository.deleteById(id);
            return "Classe deleted successfully";
        }
        return "No such Classe in the database";
    }

  
    public List<Etudiant> getClasseEtudiants(Long id) {
        Optional<Classe> classe = classeRepository.findById(id);
        return classe.map(Classe::getEtudiant).orElse(null);
    }


    public Professeur getClasseProf(Long id) {
        Optional<Classe> classe = classeRepository.findById(id);
        return classe.map(Classe::getProf).orElse(null);
    }
}
