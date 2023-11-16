package com.example.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Professeur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    
    @Column(name = "name")
    private String name;

    @Column(name = "firstName")
    private String firstname;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthDate")
    private Date birthdate;

    @Column(name = "subject")
    private String subject;


    public Professeur() {
    }

    public Professeur(long id, String name, String firstName, Date birthDate, String subject) {
        this.id = id;
        this.name = name;
        this.firstname = firstName;
        this.birthdate = birthDate;
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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


}
