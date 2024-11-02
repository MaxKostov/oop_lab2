package oop.lab2.task4.barista;

import oop.lab2.task4.coffee.*;
import oop.lab2.task4.enums.Intensity;
import oop.lab2.task4.enums.SyrupType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Barista {
    private Queue<Coffee> coffees = new LinkedList<>();

    public Barista() {
    }

    private int askForPumpkin() {
        int mg = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.print("Enter mg of pumpkin spice: ");
                String s = br.readLine();
                try {
                    mg = Integer.parseInt(s);
                    if (mg < 10 || mg > 3000) {
                        System.out.println("The coffee will taste bad.");
                        System.out.println("Please specify another quantity.");
                        System.out.println(" ");
                    }
                    else {
                        break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Invalid pumpkin spice number");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return mg;
    }

    private int askForMilk() {
        int milk = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.print("Enter ml of milk: ");
                String s = br.readLine();
                try {
                    milk = Integer.parseInt(s);
                    if (milk < 10 || milk > 100) {
                        System.out.println("The coffee will taste bad.");
                        System.out.println("Please specify another quantity.");
                        System.out.println(" ");
                    }
                    else {
                        break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Invalid milk number");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return milk;
    }

    private int askForWater() {
        int water = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.print("Enter ml of water: ");
                String s = br.readLine();
                try {
                    water = Integer.parseInt(s);
                    if (water < 10 || water > 100) {
                        System.out.println("The coffee will taste bad.");
                        System.out.println("Please specify another quantity.");
                        System.out.println(" ");
                    }
                    else {
                        break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Invalid water number");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return water;
    }

    private Intensity askForIntensity() {
        int intensity = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select an intensity: ");
        System.out.println("1. Light");
        System.out.println("2. Normal");
        System.out.println("3. Strong");

        try {
            while (true) {
                System.out.print("Type the number: ");
                String s = br.readLine();
                try {
                    intensity = Integer.parseInt(s);
                    if (intensity < 1 || intensity > 3) {
                        System.out.println("Invalid intensity");
                    }
                    else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid intensity");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (intensity) {
            case 1 -> {
                return Intensity.LIGHT;
            }
            case 2 -> {
                return Intensity.NORMAL;
            }
            case 3 -> {
                return Intensity.STRONG;
            }
        }
        return Intensity.NORMAL;
    }

    private SyrupType askForSyrup() {
        int syrup = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select an intensity: ");
        System.out.println("1. Macadamia");
        System.out.println("2. Vanilla");
        System.out.println("3. Coconut");
        System.out.println("4. Caramel");
        System.out.println("5. Chocolate");
        System.out.println("6. Popcorn");

        try {
            while (true) {
                System.out.print("Type the number: ");
                String s = br.readLine();
                try {
                    syrup = Integer.parseInt(s);
                    if (syrup < 1 || syrup > 6) {
                        System.out.println("Invalid syrup");
                    }
                    else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid syrup");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (syrup) {
            case 1 -> {
                return SyrupType.MACADAMIA;
            }
            case 2 -> {
                return SyrupType.VANILLA;
            }
            case 3 -> {
                return SyrupType.COCONUT;
            }
            case 4 -> {
                return SyrupType.CARAMEL;
            }
            case 5 -> {
                return SyrupType.CHOCOLATE;
            }
            case 6 -> {
                return SyrupType.POPCORN;
            }
        }
        return SyrupType.VANILLA;
    }

    public void orderCoffee() {
        System.out.println("Which coffee would you like to order?");
        System.out.println("1. Simple coffee");
        System.out.println("2. Americano");
        System.out.println("3. Cappuccino");
        System.out.println("4. Pumpkin Spice Latte");
        System.out.println("5. Syrup Cappuccino");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;

        try {
            while (true) {
                System.out.print("Type the number: ");
                String number = reader.readLine();
                try {
                    choice = Integer.parseInt(number);
                    if (choice < 1 || choice > 5) {
                        System.out.println("Please enter a number between 1 and 5");
                    }
                    else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number");
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        switch (choice) {
            case 1 -> {
                Intensity intensity = askForIntensity();
                coffees.add(Coffee.makeCoffee(intensity));
            }
            case 2 -> {
                Intensity intensity = askForIntensity();
                int water = askForWater();
                coffees.add(Americano.makeAmericano(intensity, water));
            }
            case 3 -> {
                Intensity intensity = askForIntensity();
                int milk = askForMilk();
                coffees.add(Cappuccino.makeCappuccino(intensity, milk));
            }
            case 4 -> {
                Intensity intensity = askForIntensity();
                int milk = askForMilk();
                int pumpkin = askForPumpkin();
                coffees.add(PumpkinSpiceLatte.makePumpkinSpiceLatte(intensity, milk, pumpkin));
            }
            case 5 -> {
                Intensity intensity = askForIntensity();
                int milk = askForMilk();
                SyrupType syrup = askForSyrup();
                coffees.add(SyrupCappuccino.makeSyrupCappuccino(intensity, milk, syrup));
            }
        }

    }

    public void getCoffee() {
        Coffee c = coffees.poll();
        c.printCoffeeDetails();
    }
}
