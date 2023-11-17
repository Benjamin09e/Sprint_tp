package com.example.Service;

import java.util.List;

import com.example.Entity.Classe;

public interface ClasseService {
     Classe saveClasse(Classe p,Long id);

    List<Classe> fetchAllClasse();

    Classe getClasseById(Long id);

    Classe updateClasseById(Long id, Classe p);

    String deleteClasse(Long id);
}
