package by.epamtc.aladzyin.layer.main;

import by.epamtc.aladzyin.layer.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		if(!appliances.isEmpty()){
			for (Appliance appliance : appliances ){
				appliance.showInfo();
			}
		}else {
			System.out.println("The search has no results" + "\n");
		}
	}
}
