package world;

public class DrinkableLiquid extends Liquid {
    private String category;


    public DrinkableLiquid() {
    }

    public DrinkableLiquid(String name, Integer volume, Double temperture, String category) {
        super(name, volume, temperture);
        setCategory(category);
    }


    public void setCategory(String category) {
        if (category.equals("Alcoholic") || category.equals("Cold Drinks") || category.equals("Hot drinks")) {
            this.category = category;
        } else {
            System.err.println("Error");
        }
    }

    public String getCategory() {
        return category;
    }

}
