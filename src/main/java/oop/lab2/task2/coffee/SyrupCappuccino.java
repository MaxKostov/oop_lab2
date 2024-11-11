package oop.lab2.task2.coffee;

import oop.lab2.task2.enums.Intensity;
import oop.lab2.task2.enums.SyrupType;

public class SyrupCappuccino extends Cappuccino{
    private SyrupType syrup;
    private final String coffee = "SyrupCappuccino";

    public SyrupCappuccino(Intensity intensity, int mlOfMilk,SyrupType syrup) {
        super(intensity, mlOfMilk);
        this.syrup = syrup;
    }

    @Override
    public String getName() {
        return coffee;
    }

    public SyrupType getSyrup() {
        return syrup;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Syrup: " + syrup);
    }
}
