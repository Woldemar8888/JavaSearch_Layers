package by.epamtc.aladzyin.layer.service.validation;

import by.epamtc.aladzyin.layer.entity.criteria.Criteria;

import java.util.Arrays;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		// you may add your own code here
		if(criteria.getGroupSearchName().isEmpty() ||
			criteria == null){

			return false;
		}

		return true;
	}

}

//you may add your own new classes