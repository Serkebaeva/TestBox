package org.example;

public class Animal {
    private String species;
    private int wasteProducing;
    private int livingSpace;
    private int age;

    public Animal(String species, int wasteProducing, int livingSpace, int age) {
        this.species = species;
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

    public void age(){
        this.age++;
    }


}
