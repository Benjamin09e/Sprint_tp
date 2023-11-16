package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Entity.Professeur;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur,Long> {
    
}
