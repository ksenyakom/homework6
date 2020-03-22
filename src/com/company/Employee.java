package com.company;

public class Employee extends Person {

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public int getVacation() {
        return vacation;
    }

    public Employee(String name, String surname, int phoneNumber, String position) {
        super(name, surname, phoneNumber, position);
    }

    public Employee(String name, String surname, int phoneNumber, String position, float salary, int vacation, String street, int houseNumber, int flat) {
        super(name, surname, phoneNumber, position, salary, vacation, street, houseNumber, flat);
    }
}
