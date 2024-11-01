package oop.lab2.task2.coffee;

import oop.lab2.task2.enums.Intensity;

public class Americano extends Coffee{
    private int mlOfWater;
    private final String coffeeName = "Americano";
    public Americano(Intensity intensityOfCoffee, int mlOfWater) {
        super(intensityOfCoffee);
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }
    public String getCoffeeName() {
        return coffeeName;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("Making " + coffeeName);
        System.out.println("Intensity set to " + super.getCoffeeIntensity());
        System.out.println("Adding " + mlOfWater + " ml of water");
    }
}
