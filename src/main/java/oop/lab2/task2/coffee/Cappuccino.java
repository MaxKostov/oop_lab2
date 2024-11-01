package oop.lab2.task2.coffee;

import oop.lab2.task2.enums.Intensity;

public class Cappuccino extends Coffee{
    private int mlOfMilk;
    private final String coffee = "Cappuccino";

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public String getCoffee() {
        return coffee;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("Making " + coffee);
        System.out.println("Intensity set to " + super.getCoffeeIntensity());
        System.out.println("Adding " + mlOfMilk + " ml of milk");
    }
}
