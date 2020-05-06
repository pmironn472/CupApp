package world;

import world.DrinkableLiquid;

public class Liquid {
    private String name;
    private Integer volume;
    private Double temperture;

    public Liquid() {

    }

    public Liquid(String name, Integer volume, Double temperture) {
        setName(name);
        setVolume(volume);
        setTemperture(temperture);
    }

    public void setName(String name) {
        if (name.length() == 0) {
            System.err.println("Error");
        } else {
            this.name = name;
        }
    }

    public void setVolume(Integer volume) {
        if (volume <= 0) {
            System.err.println("Error");
        } else {
            this.volume = volume;
        }
    }

    public void setTemperture(Double temperture) {
        if (temperture >= 0 && temperture <= 100) {
            this.temperture = temperture;
        } else {
            System.err.println("Error");
        }
    }


    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    public Double getTemperture() {
        return temperture;
    }


    public Boolean isCold() {
        return (getTemperture() <= 18);

    }


    public Boolean isWarm() {
        return (getTemperture() > 18 && getTemperture() <= 36);

    }

    public Boolean isHot() {
        return (getTemperture() > 36);
    }

    public String getCategory() {
        return getCategory();
    }

    public String getLevel() {
        return getLevel();
    }

}
