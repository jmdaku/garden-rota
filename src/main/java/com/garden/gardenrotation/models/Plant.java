package com.garden.gardenrotation.models;

import jakarta.persistence.*;

//defines entries in the plant table
@Entity
@Table(name = "plant")
public class Plant {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String family;

    private int boxId;

    @Column(nullable = false)
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
