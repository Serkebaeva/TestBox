package org.example;

public class GlobalMethods {

    public static void updateAge(Animal animal){
        animal.getAged();
        System.out.println("Updated Animal Age: " + animal.getAge());
    }

    public static void updateAge(ZooKeeper zooKeeper){
        zooKeeper.getAged();
        System.out.println("Updated ZooKeeper Age: " + zooKeeper.getAge());
    }


}
