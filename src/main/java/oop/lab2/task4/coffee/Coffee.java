package oop.lab2.task4.coffee;

import oop.lab2.task4.enums.Intensity;

public class Coffee {
    private Intensity coffeeIntensity;
    private final String name = "Coffee";

    public Coffee(Intensity coffeeIntensity) {
        this.coffeeIntensity = coffeeIntensity;
    }

    public String getName() {
        return name;
    }

    public Intensity getCoffeeIntensity() {
        return coffeeIntensity;
    }

    public void printCoffeeDetails() {
        System.out.println("Coffee name: " + getName());
        System.out.println("Intensity: " + coffeeIntensity);
    }

    public void recipeCoffee() {
        System.out.println("Making: " + getName());
        System.out.println("Intensity set to " + getCoffeeIntensity());
    }

    public static Coffee makeCoffee(Intensity coffeeIntensity) {
        Coffee coffee = new Coffee(coffeeIntensity);
        coffee.recipeCoffee();
        return coffee;
    }
}
