package com.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Classe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "name")
    private String name;

    @OneToOne  @JoinColumn( name="professeurId" )
    private Professeur prof;


    @Column(name = "max")
    private int max;
    


  


    public Classe(long id, String name,int max) {
        this.id = id;
        this.name = name;
        this.max=max;
    }


    public Classe() {
    }


    public Professeur getProf() {
        return prof;
    }


    public void setProf(Professeur prof) {
        this.prof = prof;
    }
    

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


      public int getMax() {
        return max;
    }


    public void setMax(int max) {
        this.max = max;
    }
}
