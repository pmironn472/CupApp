package main;

import kitchen.Cup;

public class Application {
    public static void main(String[] args) {
        Cup cupA = new Cup("Milk", 300.00);
        Cup cupB = new Cup("Water", 500.00);

        System.out.println("CupA: " + (cupA.getLiquidVolume() - 50) + " " + cupA.getLiquidName());
        System.out.println("CupB: " + (cupB.getLiquidVolume() + 50) + " " + cupB.getLiquidName());


    }
}
