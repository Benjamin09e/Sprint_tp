package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personne{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String firstname;

     public Personne(){
        
    }

    public Personne(long id, String nom, String prenom){
        this.id=id;
        name=nom;
        firstname=prenom;
    }

    public long getPersonneId() {
        return id;
    }

    public void setPersonneId(long personneId) {
        this.id = personneId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

   
}