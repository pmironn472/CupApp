package main;

import kitchen.Cup;

public class Application {
    public static void main(String[] args) {
        Cup cupA = new Cup("Milk", 300.00);
        Cup cupB = new Cup("Water", 500.00);

       cupA.setLiquidVolume(cupA.getLiquidVolume()-50);
       cupB.setLiquidVolume(cupB.getLiquidVolume()+50);
        System.out.println("CupA: " + cupA.getLiquidVolume() + " " + cupA.getLiquidName());
        System.out.println("CupA: " + cupB.getLiquidVolume() + " " + cupB.getLiquidName());


    }
}