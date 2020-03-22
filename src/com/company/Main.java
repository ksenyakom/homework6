package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] staff = new Person[4];
        staff[0] = new Employee("Иван", "Иванов", 291111111, "рабочий");
        staff[1] = new Employee("Василий", "Васильев", 332222222, "техник");
        staff[2] = new Employee("Петр", "Петров", 443333333, "уборщик", 500, 25,"Строителей",5,6);
        staff[3] = new Manager("Александр", "Александров", 114444444, "старший менеджер", 1000, 25,"Победителей",5,6, 1.5f, 1.1f);
        for (Person printStaff:staff) {
            System.out.println(printStaff);
        }
    }
}
