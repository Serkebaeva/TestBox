package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zoo {
    private List<Enclosure> enclosures = new ArrayList<Enclosure>();
    private String name;

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void printAllAnimalsInZoo() {
//        System.out.println("All animals in ZOO: "+ name);
//        for (Enclosure enclosure : enclosures) {
//            for (Animal element : enclosure.getAnimals()) {
//                System.out.println(element);
//            }
//        }
//    }

    public void printAllAnimalsInZoo() {
        System.out.println("All animals in ZOO current: "+ name);
        for(Animal currentAnimal : getAllAnimals()) {
            System.out.println(currentAnimal);
        }

    }

    public  void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
        if(!validate()) {
            enclosures.removeLast();
            System.out.println("Not Validated enclosure");
        }
    }

    public ArrayList<Animal> getAllAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();
        for (Enclosure currentEnclosure: enclosures) {
            animals.addAll(currentEnclosure.getAnimals());
        }
        return animals;
    }



    public boolean validate() {
        List<Integer> ids = new ArrayList<Integer>();
        for(Animal currentAnimal : getAllAnimals()) {
            ids.add(currentAnimal.getId());
        }

        Collections.sort(ids);
        for (int i = 0; i < ids.size() - 1; i++) {
            if(ids.get(i) == ids.get(i+1)) {
                return false;
            }

        }
        return true;
    }

}
