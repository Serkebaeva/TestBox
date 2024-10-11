package org.example;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        Animal monkey1 = new Animal("Monkey", 1,  2, 4, 5);
        //System.out.println(monkey1.getSpecies());
        //System.out.println(monkey1.getAge());
        //System.out.println("1 year later");
        //GlobalMethods.updateAge(monkey1);
        //System.out.println(monkey1.getSpecies());
        //System.out.println(monkey1.getAge());
        Animal monkey2 = new Animal("Monkey", 2, 1, 2, 1);
        Animal monkey3 = new Animal("Monkey", 3, 2, 4, 6);
        ArrayList monkeys = new ArrayList<>();
        monkeys.add(monkey1);
        monkeys.add(monkey2);
        monkeys.add(monkey3);
        Enclosure enclosure = new Enclosure(20, monkeys, "monkeysEnclosure" );
        //new Enclosure(20, new ArrayList<>(Arrays.asList(monkey1, monkey2, monkey3)), "Monkey Enclosure");
        //System.out.println(enclosure.getName());
        //System.out.println(enclosure.remainingSpace());
        //System.out.println(enclosure.daysBeforeFull());
        //ZooKeeper worker1 = new ZooKeeper("John", "Doe", 28, 25, "Cleaning", 15);
        //System.out.println("name: "+ worker1.getName()+ ", surname: "+ worker1.getSurname());
        //System.out.println(worker1.getAge());
        //GlobalMethods.updateAge(worker1);
        //System.out.println(worker1.getAge());
        // System.out.println(worker1.getSalary());
        //System.out.println(worker1.wageGrowthTo(3));
        //System.out.println(worker1.getSalary());
        //System.out.println(worker1.getSalaryPerMonth());
        //System.out.println(worker1.calculateSalary(120));
        //System.out.println(worker1.calculateSalary(80));
        System.out.println(enclosure.getEnclosureAnimals());


    }
}