package com.epamjavaweb.task10class.taskappliance.service.impl;

import com.epamjavaweb.task10class.taskappliance.dao.ApplianceDAO;
import com.epamjavaweb.task10class.taskappliance.dao.DAOException;
import com.epamjavaweb.task10class.taskappliance.dao.DAOFactory;
import com.epamjavaweb.task10class.taskappliance.entity.Appliance;
import com.epamjavaweb.task10class.taskappliance.entity.criteria.Criteria;
import com.epamjavaweb.task10class.taskappliance.service.ApplianceService;
import com.epamjavaweb.task10class.taskappliance.service.ServiceException;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        List<Appliance> appliances;

        if (criteria.getCriteria().isEmpty()) {
            throw new ServiceException("Incorrect request");
        }

        try {

            DAOFactory daoObjFactory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = daoObjFactory.getApplianceDAO();
            appliances = applianceDAO.find(criteria);

        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return appliances;
    }
}
