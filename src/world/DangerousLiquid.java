package world;

public class DangerousLiquid extends Liquid {
    private String level;

    public DangerousLiquid() {

    }

    public DangerousLiquid(String name, Integer volume, Double temperture, String level) {
        super(name, volume, temperture);
        setLevel(level);
    }


    public void setLevel(String level) {
        if (level.equals("Deadly") || level.equals("Toxic")) {
            this.level = level;
        } else {
            System.err.println("Error");
        }
    }

    public String getLevel() {
        return level;
    }
}
