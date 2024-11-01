package oop.lab2.task1;

import oop.lab2.task1.Barista;
import oop.lab2.task1.coffee.*;
import oop.lab2.task1.enums.Intensity;
import oop.lab2.task1.enums.SyrupType;

public class Main {
    public static void main(String[] args) {
        Coffee coffee;
        Barista barista = new Barista();
        barista.orderCoffee(new Americano(Intensity.NORMAL, 20));
        barista.orderCoffee(new Cappuccino(Intensity.LIGHT, 40));
        barista.orderCoffee(new PumpkinSpiceLatte(Intensity.STRONG, 30, 10));
        barista.orderCoffee(new SyrupCappuccino(Intensity.NORMAL, 30, SyrupType.CARAMEL));

        do {
            coffee = barista.getCoffee();
            if (coffee != null) {
                System.out.println("Making the coffee");
                System.out.println("==================================");
            }else {
                System.out.println("Nobody ordered the coffee");
            }
        } while (coffee != null);
    }
}