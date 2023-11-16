package com.example.Service;

import java.util.List;

import com.example.Entity.Personne;

public interface PersonneService {

    Personne savePersonne(Personne p);

    List<Personne> fetchAllPersonne();

    Personne getPersonneById(Long id);

    Personne updatePersonneById(Long id, Personne p);

   
} 
    

