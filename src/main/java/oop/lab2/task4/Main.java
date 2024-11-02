package oop.lab2.task4;

import oop.lab2.task4.barista.Barista;

public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista();
        barista.orderCoffee();
        System.out.println("-------------------------------------");
        barista.getCoffee();
    }
}