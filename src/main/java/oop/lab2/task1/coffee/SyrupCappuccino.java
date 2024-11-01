package oop.lab2.task1.coffee;

import oop.lab2.task1.enums.Intensity;
import oop.lab2.task1.enums.SyrupType;

public class SyrupCappuccino extends Cappuccino{
    private SyrupType syrup;
    private final String coffee = "SyrupCappuccino";

    public SyrupCappuccino(Intensity intensity, int mlOfMilk,SyrupType syrup) {
        super(intensity, mlOfMilk);
        this.syrup = syrup;
    }

    public String getCoffee() {
        return coffee;
    }

    public SyrupType getSyrup() {
        return syrup;
    }
}
