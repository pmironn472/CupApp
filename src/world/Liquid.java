package world;

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
        if (name.contains(" ")) {
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
        if (getTemperture() <= 18) {
            System.out.println("Is Cold ? - True");
        } else {
            System.out.println("Is Cold ? - False");

        }
        return true;
    }


    public Boolean isWarm() {
        if (getTemperture() > 18 && getTemperture() <= 36) {
            System.out.println("Is Warm ? - True");

        } else {
            System.out.println("Is Warm ? - False");

        }
        return true;
    }

    public Boolean isHot() {
        if (getTemperture() > 36) {
            System.out.println("Is Hot ? - True");

        } else {
            System.out.println("Is Hot ? - False");

        }
        return true;
    }

}
