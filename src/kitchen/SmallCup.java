package kitchen;

public class SmallCup extends Cup {


    public SmallCup() {
    }

    public SmallCup(String liquidName, Double liquidVolume) {
        super(liquidName, liquidVolume);
    }

    public void setLiquidVolume(Double liquidVolume) {
        if (liquidVolume >= 0 && liquidVolume <= 250) {
            super.setLiquidVolume(liquidVolume);
        } else {
            System.err.println("Error");
        }
    }
}
