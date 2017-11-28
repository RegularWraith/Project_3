package com.practice_1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Андрій");
        person1.setBirthyear(1887);
        Person person2 = new Person("Іван");
        person2.setBirthyear(2011);
        Person person3 = new Person("Петро");
        person3.setBirthyear(2000);
        Person person4 = new Person("Галина");
        person4.setBirthyear(252);
        Person person5 = new Person("Вікторія");
        person5.setBirthyear(2001);
        System.out.println("Введені люди ");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println();
    }
}
