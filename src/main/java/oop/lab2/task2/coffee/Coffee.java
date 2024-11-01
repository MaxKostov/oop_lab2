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
        System.out.println("Making " + name);
        System.out.println("Intensity set to " + coffeeIntensity);
    }
}
