package by.epamtc.aladzyin.layer.entity;

import java.util.Map;

public class Speakers extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int NUMBER_OF_SPEAKERS;
    private final String FREQUENCY_RANGE;
    private final int CORD_LENGTH;


    public Speakers(Map<String, String> params) {
        POWER_CONSUMPTION = Integer.parseInt(params.get("POWER_CONSUMPTION"));
        NUMBER_OF_SPEAKERS = Integer.parseInt(params.get("NUMBER_OF_SPEAKERS"));
        FREQUENCY_RANGE = params.get("FREQUENCY_RANGE");
        CORD_LENGTH = Integer.parseInt(params.get("CORD_LENGTH"));
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public int getNUMBER_OF_SPEAKERS() {
        return NUMBER_OF_SPEAKERS;
    }

    public String getFREQUENCY_RANGE() {
        return FREQUENCY_RANGE;
    }

    public int getCORD_LENGTH() {
        return CORD_LENGTH;
    }

    @Override
    public void showInfo() {
        System.out.println("Appliance type : Speakers" + "\n" +
                "\t" + "POWER_CONSUMPTION = " + POWER_CONSUMPTION + "\n" +
                "\t" + "NUMBER_OF_SPEAKERS = " + NUMBER_OF_SPEAKERS  + "\n" +
                "\t" + "FREQUENCY_RANGE = " + FREQUENCY_RANGE + "\n" +
                "\t" + "CORD_LENGTH = " + CORD_LENGTH + "\n"
        );
    }
}
