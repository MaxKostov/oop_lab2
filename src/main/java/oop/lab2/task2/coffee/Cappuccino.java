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

    @Override
    public String getName() {
        return coffee;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Milk: " + mlOfMilk + " ml");
    }
}
