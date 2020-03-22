package com.company;

public abstract class Person {
    protected String name;
    protected String surname;
    protected int phoneNumber;
    protected String position;
    protected float salary;
    protected int vacation;
    protected String street;
    protected int houseNumber;
    protected int flat;



    public abstract float getSalary();

    public abstract int getVacation();

    public Person(String name, String surname, int phoneNumber, String position) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public Person(String name, String surname, int phoneNumber, String position, float salary, int vacation, String street, int houseNumber, int flat) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flat = flat;
        this.vacation = vacation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getFlat() {
        return flat;
    }
@Override
    public String toString() {
        String s = "";
        if (name != null) s = name;
        if (surname != null) s = s +" " + surname;
        if (phoneNumber != 0) s = s + ", телефон: " + phoneNumber;
        if (position != null) s = s + ", должность: " + position;
        if (salary != 0) s = s + ", оклад: " + this.getSalary();
        if (vacation != 0) s = s + ", отпуск: " + this.getVacation();
        if (street != null) s = s + ", Адрес: ул." + street;
        if (houseNumber != 0) s = s +" " + houseNumber;
        if (flat != 0) s = s + "-" + flat;
        return s;
    }

}
