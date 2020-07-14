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

    @Override
    public String toString() {
        return "Refrigerator{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}' + '\n';
    }
}
