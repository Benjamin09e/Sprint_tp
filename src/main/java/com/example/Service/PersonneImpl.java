package com.example.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Personne;
import com.example.Repository.PersonneRepository;
 @Service
public class PersonneImpl implements PersonneService {


    @Autowired
    private PersonneRepository personneRepository;

    @Override
    public Personne savePersonne(Personne p) {
        return personneRepository.save(p);
    }

    @Override
    public List<Personne> fetchAllPersonne() {
        List<Personne> allEmployees = personneRepository.findAll();
        return allEmployees;
    }

    @Override
    public Personne getPersonneById(Long id) {
        Optional<Personne> employee = personneRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        }
        return null;
    }

    @Override
    public Personne updatePersonneById(Long id, Personne p) {
        Optional<Personne> pers = personneRepository.findById(id);

        if (pers.isPresent()) {
            Personne originalPeronnse = pers.get();

            if (Objects.nonNull(pers.get().getName()) && !"".equalsIgnoreCase(p.getName())) {
                originalPeronnse.setName(p.getName());
            }
            if (Objects.nonNull(pers.get().getFirstName()) && !"".equalsIgnoreCase(p.getFirstName())) {
                originalPeronnse.setFirstName(p.getFirstName());
            }
            return personneRepository.save(originalPeronnse);
        }
        return null;
    }  
}




