package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        Animal monkey1 = new Animal("Monkey", 1,  2, 4, 5);
        System.out.println(monkey1.getAge());
        System.out.println("1 year later");
        monkey1.updateAge();
        System.out.println(monkey1.getSpecies());
        System.out.println(monkey1.getAge());
        Animal monkey2 = new Animal("Monkey", 2, 1, 2, 1);
        Animal monkey3 = new Animal("Monkey", 3, 2, 4, 6);
        ArrayList monkeys = new ArrayList<>();
        monkeys.add(monkey1);
        monkeys.add(monkey2);
        monkeys.add(monkey3);
        Enclosure enclosure = new Enclosure(20, monkeys, "Monkeys Enclosure" );
        Animal parrot1 = new Animal("Parrot", 4, 1, 1, 1);
        //new Enclosure(20, new ArrayList<>(Arrays.asList(monkey1, monkey2, monkey3)), "Monkey Enclosure");
        System.out.println(enclosure.getName());
        System.out.println(enclosure.remainingSpace());
        System.out.println(enclosure.daysBeforeFull());
        ZooKeeper worker1 = new ZooKeeper("John", "Doe", 28, 25, "Cleaning", 15);
        System.out.println("name: "+ worker1.getName()+ ", surname: "+ worker1.getSurname());
        System.out.println(worker1.getAge());
        worker1.updateAge();
        System.out.println(worker1.getAge());
        System.out.println(worker1.getSalaryRate());
        worker1.wageGrowthTo(3);
        System.out.println(worker1.getSalaryRate());
        worker1.setWorkedHoursPerMonth(120);
        System.out.println(worker1.calculateSalary());
        worker1.setWorkedHoursPerMonth(140);
        System.out.println(worker1.calculateSalary());
        enclosure.printEnclosureAnimals();
        System.out.println();
        ArrayList parrots = new ArrayList<>();
        parrots.add(parrot1);
        Enclosure enclosure2 = new Enclosure(20, parrots, "Parrots Enclosure" );
        enclosure2.printEnclosureAnimals();
        System.out.println();
        Animal.getAllAnimals();
        System.out.println(Animal.getTotalAnimalsCreated());
        System.out.println(worker1.wageGrowthTo(-7));
        Animal.getAllAnimals();
        Zoo park1 = new Zoo("Park1");
        park1.addEnclosure(enclosure);
        park1.addEnclosure(enclosure2);
        park1.printAllAnimalsInZoo();
        park1.addEnclosure(enclosure);
        park1.printAllAnimalsInZoo();
        System.out.println(park1.validate());
        park1.printAllAnimalsInZoo();



    }
}