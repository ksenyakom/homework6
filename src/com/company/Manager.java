package com.company;

public class Manager extends Person {
    private float koefSalary;
    private float koefVacation;

    public Manager(String name, String surname, int phoneNumber, String position) {
        super(name, surname, phoneNumber, position);
    }

    public Manager(String name, String surname, int phoneNumber, String position, float koefSalary, float koefVacation) {
        super(name, surname, phoneNumber, position);
        this.koefSalary = koefSalary;
        this.koefVacation = koefVacation;
    }

    public Manager(String name, String surname, int phoneNumber, String position, float salary, int vacation, String street, int houseNumber, int flat, float koefSalary, float koefVacation) {
        super(name, surname, phoneNumber, position, salary, vacation, street, houseNumber, flat);
        this.koefSalary = koefSalary;
        this.koefVacation = koefVacation;
    }


    @Override
    public float getSalary() {
        return salary * koefSalary;
    }

    @Override
    public int getVacation() {
        return Math.round(vacation * koefVacation);
    }

    public String toString() {
        String s = super.toString();
        if (koefSalary != 0) s = s + "," + " коэффицинт оклада: " + koefSalary;
        if (koefVacation != 0) s = s + " коэффициент отпуск: " + koefVacation;
        return s;
    }
}
