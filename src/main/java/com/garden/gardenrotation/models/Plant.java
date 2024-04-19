package com.garden.gardenrotation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Plant {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String family;

    private int boxId;

    private boolean perennial;

    //TODO: add list

    //constructors
    public Plant(int id, String name, String family, int boxId, boolean perennial) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.boxId = boxId;
        this.perennial = perennial;
    }

    public Plant() {}

    //getters & setters
    public int getId() {return id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getFamily() {return family;}

    public void setFamily(String family) {this.family = family;}

    public int getBoxId() {return boxId;}

    public void setBoxId(int box) {this.boxId = boxId;}

    public boolean isPerennial() {return perennial;}

    public void setPerennial(boolean perennial) {this.perennial = perennial;}

}
