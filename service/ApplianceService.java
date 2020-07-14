package by.epamtc.aladzyin.layer.service;

import by.epamtc.aladzyin.layer.entity.Appliance;
import by.epamtc.aladzyin.layer.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria) throws IOException;
	
}
