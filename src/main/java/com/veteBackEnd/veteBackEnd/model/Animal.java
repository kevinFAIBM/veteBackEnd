package com.veteBackEnd.veteBackEnd.model;

import java.time.LocalDate;

public class Animal {

    private int animalId;
    private String animalName;
    private String type;
    private LocalDate dob;
    private String breed;
    private String ownerName;
    private int vetId;
    private String vetName;

    public Animal(int animalId, String animalName, String type, LocalDate dob, String breed, String ownerName, int vetId) {
        super();
        this.animalId = animalId;
        this.animalName = animalName;
        this.type = type;
        this.dob = dob;
        this.breed = breed;
        this.ownerName = ownerName;
        this.vetId = vetId;
    }

    public Animal(int animalId, String animalName, String type, LocalDate dob, String breed, String ownerName, int vetId, String vetName) {

        this.animalId = animalId;
        this.animalName = animalName;
        this.type = type;
        this.dob = dob;
        this.breed = breed;
        this.ownerName = ownerName;
        this.vetId = vetId;
        this.vetName = vetName;
    }

    public Animal() {
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }
}
