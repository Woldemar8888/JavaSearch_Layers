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

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", FILTER_TYPE='" + FILTER_TYPE + '\'' +
                ", BAG_TYPE='" + BAG_TYPE + '\'' +
                ", WAND_TYPE='" + WAND_TYPE + '\'' +
                ", MOTOR_SPEED_REGULATION='" + MOTOR_SPEED_REGULATION + '\'' +
                ", CLEANING_WIDTH=" + CLEANING_WIDTH +
                '}' + '\n';
    }
}
