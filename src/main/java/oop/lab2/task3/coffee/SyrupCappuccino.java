package oop.lab2.task3.coffee;

import oop.lab2.task3.enums.Intensity;
import oop.lab2.task3.enums.SyrupType;

public class SyrupCappuccino extends Cappuccino {
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

    public static Coffee makeSyrupCappuccino(Intensity intensity, int mlOfMilk,SyrupType syrup) {
        var syrupCappuccino = new SyrupCappuccino(intensity, mlOfMilk, syrup);
        System.out.println("Making " + syrupCappuccino.coffee);
        System.out.println("Intensity set to " + syrupCappuccino.getCoffeeIntensity());
        System.out.println("Adding " + syrupCappuccino.getMlOfMilk() + " ml of milk");
        System.out.println("Adding " + syrup + " syrup");
        return syrupCappuccino;
    }
}
