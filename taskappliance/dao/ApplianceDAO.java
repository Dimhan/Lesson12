package com.epamjavaweb.task10class.taskappliance.dao;

import java.util.List;

import com.epamjavaweb.task10class.taskappliance.entity.Appliance;
import com.epamjavaweb.task10class.taskappliance.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws DAOException;

}