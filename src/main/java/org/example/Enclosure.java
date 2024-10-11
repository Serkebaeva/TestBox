package org.example;

import java.util.ArrayList;

public class Enclosure {
    int size;
    ArrayList<Animal> animals;
    String name;

    public Enclosure(int size, ArrayList<Animal> animals, String name) {
        this.size = size;
        this.animals = animals;
        this.name = name;
    }

    public ArrayList<Animal> getEnclosureAnimals() {
        for (Animal animal : animals) {
            System.out.println("Enclosure animals: "+ animal);
        }
        return animals;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int remainingSpace() {
        int usingSpace = 0;
        for (int index = 0; index < animals.size(); index++) {
            usingSpace += animals.get(index).getLivingSpace();
        }
        
        int sizeLeft = this.size-usingSpace;
        return sizeLeft;
    }

    public int daysBeforeFull(){
        int totalWaste = 0;
        for (int i = 0; i < animals.size(); i++) {
            totalWaste += animals.get(i).getWasteProducing();
        }
        return this.size / totalWaste;

    }

}
