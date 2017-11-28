package com.practice_1;

public class Person {
    private String name;
    static int year=2017;
    public int birthyear;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBirthyear() {
        return birthyear;
    }
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
    public double getAge() {
        return (double) year - birthyear;
    }
    @Override
    public String toString() {
        return "Це " + name + ", народився(лась) в = " + birthyear + " році" + ", " + "і йому(їй) зараз = " + getAge() + " років";
    }
}
