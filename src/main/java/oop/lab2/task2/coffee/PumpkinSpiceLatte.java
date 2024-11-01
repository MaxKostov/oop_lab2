package oop.lab2.task2.coffee;

import oop.lab2.task2.enums.Intensity;

public class PumpkinSpiceLatte extends Cappuccino{
    private int mgOfPumpkinSpice;
    private final String name = "PumpkinSpiceLatte";

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("Making " + name);
        System.out.println("Intensity set to " + super.getCoffeeIntensity());
        System.out.println("Adding " + super.getMlOfMilk() + " ml of milk");
        System.out.println("Adding " + mgOfPumpkinSpice + " mg of pumpkins");
    }
}