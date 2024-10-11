package org.example;

import java.util.ArrayList;

public class Animal {
    private int id;
    private String species;
    private int wasteProducing;
    private int livingSpace;
    private int age;
    private static int counter;

    private static ArrayList<Animal> allAnimals = new ArrayList<>();

    public Animal(String species, int id,  int wasteProducing, int livingSpace, int age) {
        this.species = species;
        this.id = id;
        this.wasteProducing = wasteProducing;
        this.livingSpace = livingSpace;
        this.age = age;
        counter++;


        // Add this animal to the static list of all animals
        allAnimals.add(this);
    }

    // Static method to get all animals
    public static void getAllAnimals() {
        System.out.println("All animals in ZOO:");
        for (Animal animal : allAnimals) {
            System.out.println(animal);
        }
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
        return " Animal {" +  "species='" + species + "', id= "+ id +", wasteProducing=" + wasteProducing + ", livingSpace=" + livingSpace + '}';
    }

    public static int getTotalAnimalsCreated() {
        return counter;
    }

}
