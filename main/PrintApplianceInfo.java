package by.epamtc.aladzyin.layer.main;

import by.epamtc.aladzyin.layer.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {
		if(!appliance.isEmpty()){
			System.out.println(appliance + "\n");
		}else {
			System.out.println("The search has no results" + "\n");
		}
	}
}
