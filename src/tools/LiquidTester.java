package tools;

import kitchen.Cup;
import world.DrinkableLiquid;


public class LiquidTester {


    public static Boolean isDrinkable(Cup cup) {

      return cup.getLiquid()instanceof DrinkableLiquid;
    }


}
