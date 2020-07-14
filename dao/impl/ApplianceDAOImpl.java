package by.epamtc.aladzyin.layer.dao.impl;

import by.epamtc.aladzyin.layer.dao.ApplianceDAO;
import by.epamtc.aladzyin.layer.entity.*;
import by.epamtc.aladzyin.layer.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{

	private String path = "appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		// you may add your own code here
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<Appliance> list = new ArrayList<>();

		while (bufferedReader.ready()){

			String str = bufferedReader.readLine();

			if(str.startsWith(criteria.getGroupSearchName())){
			    boolean isShouldAdd = true;

				for(Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()){

					String checkedValue;
					checkedValue = entry.getKey() + "=" +  entry.getValue().toString().toLowerCase();

					if(str.contains(checkedValue)){
						String regEx = ",.*";
						String found = str.substring(str.indexOf(checkedValue)).replaceAll(regEx, "").trim();

						if(!checkedValue.equals(found)){
                            isShouldAdd = false;
                            break;
                        }
					}else{
					    isShouldAdd = false;
					    break;
                    }
				}

				if(isShouldAdd){
				    Appliance appliance = createAppliance(str, criteria.getGroupSearchName());
				    list.add(appliance);
                }
			}
		}

		return list;
	}

	private Map<String, String> createParameters(String str) {
		Map<String, String> params = new HashMap<>();
		String lineParameters = str.replaceAll(".*: ", "").trim();

		for (String paramPair : lineParameters.split(",")) {
			String key = paramPair.replaceAll("=.*", "").trim();
			String value = paramPair.replaceAll(".*=", "").trim();
			params.put(key, value);
		}

		return params;
	}

	private Appliance createAppliance(String str, String appliance ){
		Map<String, String> params = createParameters(str);

		switch (appliance){
			case "Oven":
				return new Oven(params);
			case "Laptop":
				return new Laptop(params);

			case "Refrigerator":
				return new Refrigerator(params);
			case "Speakers":
				return new Speakers(params);
			case "TabletPC":
				return  new TabletPC(params);
			case "VacuumCleaner":
				return new VacuumCleaner(params);
			default:
				return null;
		}
	}
}

