package by.epamtc.aladzyin.layer.entity;

import java.util.Map;

public class TabletPC extends Appliance {
    private final int BATTERY_CAPACITY;
    private final int DISPLAY_INCHES;
    private final int MEMORY_ROM;
    private final int FLASH_MEMORY_CAPACITY;
    private final String COLOR;


    public TabletPC(Map<String, String> params) {
        BATTERY_CAPACITY = Integer.parseInt(params.get("BATTERY_CAPACITY"));
        DISPLAY_INCHES = Integer.parseInt(params.get("DISPLAY_INCHES"));
        MEMORY_ROM = Integer.parseInt(params.get("MEMORY_ROM"));
        FLASH_MEMORY_CAPACITY = Integer.parseInt(params.get("FLASH_MEMORY_CAPACITY"));
        COLOR = params.get("COLOR");
    }

    public int getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public int getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public int getFLASH_MEMORY_CAPACITY() {
        return FLASH_MEMORY_CAPACITY;
    }

    public String getCOLOR() {
        return COLOR;
    }

    @Override
    public void showInfo() {
        System.out.println("Appliance type : TabletPC" + "\n" +
                "\t" + "BATTERY_CAPACITY = " + BATTERY_CAPACITY + "\n" +
                "\t" + "DISPLAY_INCHES = " + DISPLAY_INCHES + "\n" +
                "\t" + "MEMORY_ROM = " + MEMORY_ROM + "\n" +
                "\t" + "FLASH_MEMORY_CAPACITY = " + FLASH_MEMORY_CAPACITY + "\n" +
                "\t" + "COLOR = " + COLOR + "\n"
        );
    }
}
