package main;

import kitchen.BigCup;
import kitchen.Cup;
import kitchen.SmallCup;
import world.Liquid;

public class Application {
    public static void main(String[] args) {


        Liquid p1 = new Liquid("Water", 500, 50.00);

        Cup standartCup = new Cup(p1);

        System.out.println(standartCup.getLiquid().getName());
        System.out.println(standartCup.getLiquid().getVolume());
        System.out.println(standartCup.getLiquid().getTemperture());

        System.out.println();


        p1.setVolume(p1.getVolume() + 50);

        System.out.println(standartCup.getLiquid().getName());
        System.out.println(standartCup.getLiquid().getVolume());
        System.out.println(standartCup.getLiquid().getTemperture());


        System.out.println();

        System.out.println(p1.isHot());
    }
}


//