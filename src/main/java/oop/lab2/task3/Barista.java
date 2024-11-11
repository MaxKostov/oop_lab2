package oop.lab2.task3;

import oop.lab2.task3.coffee.Coffee;

import java.util.LinkedList;
import java.util.Queue;

public class Barista {
    private Queue<Coffee> coffees = new LinkedList<>();

    public Barista() {
    }

    public void orderCoffee(Coffee coffee) {
        coffees.add(coffee);
    }

    public Coffee getCoffee() {
        return coffees.poll();
    }
}
