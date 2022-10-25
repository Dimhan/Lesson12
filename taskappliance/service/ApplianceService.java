package com.epamjavaweb.task10class.taskappliance.service;

import com.epamjavaweb.task10class.taskappliance.entity.Appliance;
import com.epamjavaweb.task10class.taskappliance.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    public List<Appliance> find(Criteria criteria) throws ServiceException;
}
