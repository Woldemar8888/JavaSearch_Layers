package by.epamtc.aladzyin.layer.entity;

import java.util.Map;

public class Laptop extends Appliance {
    private final double BATTERY_CAPACITY;
    private final String OS;
    private final int MEMORY_ROM;
    private final int SYSTEM_MEMORY;
    private final double CPU;
    private final double DISPLAY_INCHS;


    public Laptop(Map<String, String> params) {
        BATTERY_CAPACITY = Double.parseDouble(params.get("BATTERY_CAPACITY"));
        OS = params.get("OS");
        MEMORY_ROM = Integer.parseInt(params.get("MEMORY_ROM"));
        SYSTEM_MEMORY = Integer.parseInt(params.get("SYSTEM_MEMORY"));
        CPU = Double.parseDouble(params.get("CPU"));
        DISPLAY_INCHS = Double.parseDouble(params.get("DISPLAY_INCHS"));
    }

    public double getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public String getOS() {
        return OS;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public int getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public double getCPU() {
        return CPU;
    }

    public double getDISPLAY_INCHS() {
        return DISPLAY_INCHS;
    }

    @Override
    public void showInfo() {
        System.out.println("Appliance type : Laptop" + "\n" +
                "\t" + "BATTERY_CAPACITY = " + BATTERY_CAPACITY + "\n" +
                "\t" + "OS = " + OS + "\n" +
                "\t" + "MEMORY_ROM = " + MEMORY_ROM + "\n" +
                "\t" + "SYSTEM_MEMORY = " + SYSTEM_MEMORY + "\n" +
                "\t" + "CPU = " + CPU + "\n" +
                "\t" + "DISPLAY_INCHS = " + DISPLAY_INCHS + "\n"
        );
    }
}
