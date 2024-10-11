package org.example;

public class ZooKeeper {
    private String name;
    private String surname;
    private static int age;
    private int salary;
    private String department;
    private int performance;
    private int workedHoursPerMonth;
    private int salaryPerMonth;


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

    public void getAged() {
        this.age++;
    }

    public int wageGrowthTo(int n) {
        this.salary += n;
        return this.salary;
    }

    public String getSalaryRate() {
        return "usd per hour: " + this.salary;
    }

    public int calculateSalary(int n) {
        this.workedHoursPerMonth = n;
        this.salaryPerMonth = workedHoursPerMonth * this.salary;
        return salaryPerMonth;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }
}
