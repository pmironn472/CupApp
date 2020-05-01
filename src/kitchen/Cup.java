package kitchen;

public class Cup {
    private String liquidName ;
    private Double liquidVolume;

    public Cup() {

    }

    public Cup(String liquidName, Double liquidVolume) {
        setLiquidName(liquidName);
        setLiquidVolume(liquidVolume);
    }

    public void setLiquidName(String liquidName) {
        if (liquidName.equals("Water") || liquidName.equals("Milk") || liquidName.equals("Tea")) {
            this.liquidName = liquidName;
        } else {
            System.err.println("There is no such product");
        }
    }

    public void setLiquidVolume(Double liquidVolume) {
        if (liquidVolume >= 0 && liquidVolume <= 600) {
            this.liquidVolume = liquidVolume;
        } else {
            System.err.println("To much ml");
        }
    }

    public String getLiquidName() {
        return liquidName;
    }

    public Double getLiquidVolume() {
        return liquidVolume;
    }

}
