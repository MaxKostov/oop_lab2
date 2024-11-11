package oop.lab2.task2.coffee;

import oop.lab2.task2.enums.Intensity;

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
}
