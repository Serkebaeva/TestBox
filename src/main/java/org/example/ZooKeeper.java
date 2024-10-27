package org.example;

public class ZooKeeper {
    private String name;
    private String surname;
    private static int age;
    private int salary;
    private String department;
    private int performance;
    private int workedHoursPerMonth;


    public ZooKeeper(String name, String surname, int age, int salary, String department, int performance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getPerformance() {
        return performance;
    }

    public void updateAge() {
        this.age++;
        wageGrowthTo(10);
    }

    public int wageGrowthTo(int n) {
        if(n < 0) {
            return -1;
        }
        this.salary += n;
        return this.salary;
    }

    public String getSalaryRate() {
        return "usd per hour: " + this.salary;
    }

    public void setWorkedHoursPerMonth(int workedHoursPerMonth) {
        this.workedHoursPerMonth = workedHoursPerMonth;
    }

    public int calculateSalary() {
        return this.workedHoursPerMonth * this.salary;
    }




}
