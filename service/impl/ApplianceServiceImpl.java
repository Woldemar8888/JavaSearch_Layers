package by.epamtc.aladzyin.layer.service.impl;

import by.epamtc.aladzyin.layer.dao.ApplianceDAO;
import by.epamtc.aladzyin.layer.dao.DAOFactory;
import by.epamtc.aladzyin.layer.entity.Appliance;
import by.epamtc.aladzyin.layer.entity.criteria.Criteria;
import by.epamtc.aladzyin.layer.service.ApplianceService;
import by.epamtc.aladzyin.layer.service.validation.Validator;
import by.epamtc.aladzyin.search.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance =  applianceDAO.find(criteria);

		return appliance;
	}
}


