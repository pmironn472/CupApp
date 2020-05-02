package main;

import kitchen.BigCup;
import kitchen.Cup;
import kitchen.SmallCup;

public class Application {
    public static void main(String[] args) {
        Cup cupA = new Cup("Milk", 300.00);
        Cup cupB = new Cup("Water", 500.00);

        cupA.setLiquidVolume(cupA.getLiquidVolume() - 50);
        cupB.setLiquidVolume(cupB.getLiquidVolume() + 50);
        System.out.println("CupA: " + cupA.getLiquidVolume() + " " + cupA.getLiquidName());
        System.out.println("CupB: " + cupB.getLiquidVolume() + " " + cupB.getLiquidName());

        System.out.println();

        SmallCup smallCup = new SmallCup("Tea", 200.00);
        System.out.println("SmallCup: " + smallCup.getLiquidVolume() + " " + smallCup.getLiquidName());

        System.out.println();

        BigCup bigC = new BigCup("Water", 200.00);
        System.out.println("BigCup: " + bigC.getLiquidVolume() + " " + bigC.getLiquidName());

        System.out.println();

        bigC.setLiquidVolume(bigC.getLiquidVolume() + cupB.getLiquidVolume());
        cupB.setLiquidVolume(0.00);
        System.out.println("BigCup + cupB: " + bigC.getLiquidVolume() + " " + bigC.getLiquidName());
        System.out.println("cupB now has : " + cupB.getLiquidVolume() + " " + cupB.getLiquidName());

    }
}