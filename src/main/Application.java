package main;

import kitchen.BigCup;
import kitchen.Cup;
import kitchen.SmallCup;
import world.DangerousLiquid;
import world.DrinkableLiquid;
import world.Liquid;

import static tools.LiquidTester.isDrinkable;

public class Application {
    public static void main(String[] args) {






        BigCup bigCup = new BigCup(new DrinkableLiquid("Water",500,16.00,"Cold Drinks"));
        SmallCup smallCup = new SmallCup(new DangerousLiquid("Disefectant",500,5.00,"Toxic"));




        
        System.out.println(bigCup.getLiquid().getName());
        System.out.println(bigCup.getLiquid().getVolume());
        System.out.println(bigCup.getLiquid().getTemperture());
        System.out.println(bigCup.getLiquid().getCategory());



        System.out.println();


        System.out.println(smallCup.getLiquid().getName());
        System.out.println(smallCup.getLiquid().getVolume());
        System.out.println(smallCup.getLiquid().getTemperture());
        System.out.println(smallCup.getLiquid().getLevel());

        System.out.println();




        System.out.println(isDrinkable(bigCup));
        System.out.println(isDrinkable(smallCup));





    }
}


//