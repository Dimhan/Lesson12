package com.epamjavaweb.task10class.taskappliance.dao;


import com.epamjavaweb.task10class.taskappliance.dao.impl.FindApplianceDAOImpl;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO deviceDAO = new FindApplianceDAOImpl();

	private DAOFactory() {
	}

	public ApplianceDAO getApplianceDAO() {
		return deviceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}