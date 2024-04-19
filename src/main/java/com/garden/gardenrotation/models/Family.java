package com.garden.gardenrotation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Family {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    //TODO: add list

    //constructors
    public Family(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Family() {}

    //getters & setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Object getPlants() {
//    }
    //TODO: complete by returning list of plants
}
