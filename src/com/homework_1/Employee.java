package com.homework_1;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static double persent;
    public static int totalHours=0;

    public Employee(String name) {
        this.name = name;
        totalHours++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public double getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
        totalHours += hours;
    }
    public static double getTotalHours(){
        return totalHours;
    }
    public double getPersent() {
        return persent;
    }
    public void setPersent(double persent) {
        this.persent = persent;
    }
    public  double getSalary() {
       return rate * hours;
    }
    public  double getPersentFromSalary() {
        return  getSalary() * persent;
    }
    public  double getPureSalary() {
        return getSalary() - getPersentFromSalary();
    }
    @Override
    public String toString() {
        return "Це " + name + ", він отримує - " + rate + " грн. за годину, та відпрацював(ла) " + hours + " годин, і заробляє в розмірі " +
                getSalary() + " гривень, з окладом " + getPersentFromSalary()+ ", а 'на руки' отримує " +
                getPureSalary() + " гривень.";
    }
}
