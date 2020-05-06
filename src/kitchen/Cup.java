package kitchen;

import world.Liquid;

public class Cup  {

    private Liquid liquid;
    final static int MAX_VOLUME = 600;

    public Cup() {
    }

    public Cup(Liquid liquid) {
        setLiquid(liquid);
    }


    public void setLiquid(Liquid liquid) {
        if (liquid.getVolume() <= MAX_VOLUME) {
            this.liquid = liquid;
        } else
            System.err.println("Error");
    }

    public Liquid getLiquid() {
        return liquid;
    }

}
