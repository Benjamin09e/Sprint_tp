package com.example.Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Etudiant {

    // In your Professeur entity class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "firstName")
    private String firstname;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthDate")
    private Date birthdate;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;


    public Etudiant() {
    }

    public Etudiant(Long id, String name, String firstname, Date birthdate, String note, Classe classe) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.note = note;
        this.classe = classe;
    }

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
