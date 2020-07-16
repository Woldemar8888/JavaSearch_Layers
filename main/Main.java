package by.epamtc.aladzyin.layer.main;

import static by.epamtc.aladzyin.layer.entity.criteria.SearchCriteria.*;

import by.epamtc.aladzyin.layer.entity.Appliance;
import by.epamtc.aladzyin.layer.entity.criteria.Criteria;
import by.epamtc.aladzyin.layer.service.ApplianceService;
import by.epamtc.aladzyin.layer.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"

		criteriaOven.add(Oven.CAPACITY.toString(), 33);


		appliances =  service.find(criteriaOven);

		PrintApplianceInfo.print( appliances);

		////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);



		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());

		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);


		appliances = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliances);
	}
}
