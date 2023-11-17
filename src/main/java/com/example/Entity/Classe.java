package com.example.Entity;

import jakarta.persistence.*;

@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "bigint")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

    public Classe () {

    }

    public Classe(Long id, String name, Professeur professeur) {
        this.id = id;
        this.name = name;
        this.professeur = professeur;
    }
// getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
}