package main;

import kitchen.Cup;

public class Application {
    public static void main(String[] args) {
        Cup cupA = new Cup("Milk", 300.00);
        Cup cupB = new Cup("Water", 500.00);

        System.out.println("Before Changes");

        cupA.printInfo();
        cupB.printInfo();

        System.out.println();
        System.out.println("After changes: ");

        cupA.minustLiquid(50);
        cupB.plusLiquid(50);

        cupA.printInfo();
        cupB.printInfo();
    }
}