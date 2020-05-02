package kitchen;

public class BigCup extends Cup {
    private Double liquidVolume;

    public BigCup() {
    }

    public BigCup(String liquidName, Double liquidVolume) {
        setLiquidVolume(liquidVolume);
        setLiquidName(liquidName);
    }

    @Override
    public void setLiquidVolume(Double liquidVolume) {
        if (liquidVolume >= 0 && liquidVolume <= 1000) {
            this.liquidVolume = liquidVolume;
        } else {
            System.err.println("error");
        }
    }

    @Override
    public Double getLiquidVolume() {
        return liquidVolume;
    }
}
