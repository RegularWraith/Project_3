package com.homework_1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Андрій");
        employee1.setRate(167);
        employee1.setHours(1550);
        employee1.setPersent(0.18);
        Employee employee2 = new Employee("Іван");
        employee2.setRate(410);
        employee2.setHours(6614);
        employee2.setPersent(0.23);
        Employee employee3 = new Employee("Петро");
        employee3.setRate(1435);
        employee3.setHours(154);
        employee3.setPersent(0.50);
        System.out.println("Введені працівники ");
        System.out.println();
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println();
        System.out.printf("Загальна кількість відпрацьованих годин = " + Employee.getTotalHours());
    }
}
