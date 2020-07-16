package by.epamtc.aladzyin.layer.entity;

import java.util.Map;

public class Oven extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int WEIGHT;
    private final int CAPACITY;
    private final int DEPTH;
    private final double HEIGHT;
    private final double WIDTH;


    public Oven(Map<String, String> params) {
        POWER_CONSUMPTION = Integer.parseInt(params.get("POWER_CONSUMPTION"));
        WEIGHT = Integer.parseInt(params.get("WEIGHT"));
        CAPACITY = Integer.parseInt(params.get("CAPACITY"));
        DEPTH = Integer.parseInt(params.get("DEPTH"));
        HEIGHT = Double.parseDouble(params.get("HEIGHT"));
        WIDTH = Double.parseDouble(params.get("WIDTH"));
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getDEPTH() {
        return DEPTH;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    @Override
    public void showInfo() {
        System.out.println("Appliance type : Oven" + "\n" +
                "\t" + "POWER_CONSUMPTION = " + POWER_CONSUMPTION + "\n" +
                "\t" + "WEIGHT = " + WEIGHT + "\n" +
                "\t" + "CAPACITY = " + CAPACITY + "\n" +
                "\t" + "DEPTH = " + DEPTH + "\n" +
                "\t" + "HEIGHT = " + HEIGHT + "\n" +
                "\t" + "WIDTH = " + WIDTH + "\n"

        );
    }
}


