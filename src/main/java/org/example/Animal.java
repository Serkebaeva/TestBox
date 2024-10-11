package org.example;

import java.util.ArrayList;

public class Animal {
    private int id;
    private String species;
    private int wasteProducing;
    private int livingSpace;
    private int age;

    public Animal(String species, int id,  int wasteProducing, int livingSpace, int age) {
        this.species = species;
        this.id = id;
        this.wasteProducing = wasteProducing;
        this.livingSpace = livingSpace;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getWasteProducing() {
        return wasteProducing;
    }

    public int getLivingSpace() {
        return livingSpace;
    }

    public int getAge() {
        return age;
    }

    public void getAged() {
        this.age++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return " Animal {" +  "species='" + species + " id= "+ id +"', wasteProducing=" + wasteProducing + ", livingSpace=" + livingSpace + '}';
    }


}
