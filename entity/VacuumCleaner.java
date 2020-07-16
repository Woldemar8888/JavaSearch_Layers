package by.epamtc.aladzyin.layer.entity;

import java.util.Map;

public class VacuumCleaner extends Appliance {
    private final int POWER_CONSUMPTION;
    private final String FILTER_TYPE;
    private final String BAG_TYPE;
    private final String WAND_TYPE;
    private final int MOTOR_SPEED_REGULATION;
    private final int CLEANING_WIDTH;


    public VacuumCleaner(Map<String, String> params) {
        POWER_CONSUMPTION = Integer.parseInt(params.get("POWER_CONSUMPTION"));
        FILTER_TYPE = params.get("FILTER_TYPE");
        BAG_TYPE = params.get("BAG_TYPE");
        WAND_TYPE = params.get("WAND_TYPE");
        MOTOR_SPEED_REGULATION = Integer.parseInt(params.get("MOTOR_SPEED_REGULATION"));
        CLEANING_WIDTH = Integer.parseInt(params.get("CLEANING_WIDTH"));
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public String getFILTER_TYPE() {
        return FILTER_TYPE;
    }

    public String getBAG_TYPE() {
        return BAG_TYPE;
    }

    public String getWAND_TYPE() {
        return WAND_TYPE;
    }

    public int getMOTOR_SPEED_REGULATION() {
        return MOTOR_SPEED_REGULATION;
    }

    public int getCLEANING_WIDTH() {
        return CLEANING_WIDTH;
    }

    @Override
    public void showInfo() {
        System.out.println("Appliance type : VacuumCleaner" + "\n" +
                "\t" + "POWER_CONSUMPTION = " + POWER_CONSUMPTION + "\n" +
                "\t" + "FILTER_TYPE = " + FILTER_TYPE + "\n" +
                "\t" + "BAG_TYPE = " + BAG_TYPE + "\n" +
                "\t" + "WAND_TYPE = " + WAND_TYPE + "\n" +
                "\t" + "MOTOR_SPEED_REGULATION = " + MOTOR_SPEED_REGULATION + "\n" +
                "\t" + "CLEANING_WIDTH = " + CLEANING_WIDTH + "\n"
        );
    }
}
