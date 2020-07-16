package by.epamtc.aladzyin.layer.entity;

import java.util.Map;

public class Refrigerator extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int WEIGHT;
    private final int FREEZER_CAPACITY;
    private final double OVERALL_CAPACITY;
    private final int HEIGHT;
    private final int WIDTH;


    public Refrigerator(Map<String, String> params) {
        POWER_CONSUMPTION = Integer.parseInt(params.get("POWER_CONSUMPTION"));
        WEIGHT = Integer.parseInt(params.get("WEIGHT"));
        FREEZER_CAPACITY = Integer.parseInt(params.get("FREEZER_CAPACITY"));
        OVERALL_CAPACITY = Double.parseDouble(params.get("OVERALL_CAPACITY"));
        HEIGHT = Integer.parseInt(params.get("HEIGHT"));
        WIDTH = Integer.parseInt(params.get("WIDTH"));
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public int getFREEZER_CAPACITY() {
        return FREEZER_CAPACITY;
    }

    public double getOVERALL_CAPACITY() {
        return OVERALL_CAPACITY;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    @Override
    public void showInfo() {
        System.out.println("Appliance type : Refrigerator" + "\n" +
                "\t" + "POWER_CONSUMPTION = " + POWER_CONSUMPTION + "\n" +
                "\t" + "WEIGHT = " + WEIGHT + "\n" +
                "\t" + "FREEZER_CAPACITY = " + FREEZER_CAPACITY + "\n" +
                "\t" + "OVERALL_CAPACITY = " + OVERALL_CAPACITY + "\n" +
                "\t" + "HEIGHT = " + HEIGHT + "\n" +
                "\t" + "WIDTH = " + WIDTH + "\n"
        );
    }
}
