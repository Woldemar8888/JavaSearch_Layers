package by.epamtc.aladzyin.layer.dao;

import by.epamtc.aladzyin.layer.entity.Appliance;
import by.epamtc.aladzyin.layer.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws IOException;
}
