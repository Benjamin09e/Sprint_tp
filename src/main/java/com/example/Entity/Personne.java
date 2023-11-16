package com.example.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "personne", schema = "school")
public class Personne{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "firstName")
    private String firstname;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthDate")
    private Date birthdate;

     
    public Personne(){}

    public Personne(long id, String name, String firstName, Date birthDate) {
        this.id = id;
        this.name = name;
        this.firstname = firstName;
        this.birthdate = birthDate;
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

    public Date getBirthDate() {
        return birthdate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthdate = birthDate;
    }
   
}