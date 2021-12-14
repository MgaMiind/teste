package com.example.sistemacadastro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_HERO")
public class Estudante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int phone;
    private String city;
    private String fatec;
   

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setNane(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getfatec() {
        return fatec;
    }
    public void setFatec(String fatec) {
        this.fatec = fatec;
    }
    public int getIdade() {
        return phone;
    }
    public void setIdade(int phone) {
        this.phone = phone;
    }

}
