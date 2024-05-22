package com.garden.gardenrotation.models;

import jakarta.persistence.*;


//defines entries in the plant table
@Entity
@Table(name = "box")
public class Box {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private String location;


    //constructors
    public Box(int id, int year, String location) {
        this.id = id;
        this.year = year;
        this.location = location;
    }

    public Box() {
    }


    //getters & setters


    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
