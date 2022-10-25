package com.epamjavaweb.task10class.taskappliance.dao.impl;

import com.epamjavaweb.task10class.taskappliance.dao.*;
import com.epamjavaweb.task10class.taskappliance.dao.util.ApplianceDataMatcher;
import com.epamjavaweb.task10class.taskappliance.dao.util.ApplianceListCreator;
import com.epamjavaweb.task10class.taskappliance.dao.util.ReadApplianceDataFromTXT;
import com.epamjavaweb.task10class.taskappliance.entity.Appliance;
import com.epamjavaweb.task10class.taskappliance.entity.criteria.Criteria;

import java.util.List;

public class FindApplianceDAOImpl implements ApplianceDAO {

    private final String PATH_FILE = "\\TestProg\\appliances_task.txt";

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {

        ReadApplianceDataFromTXT readApplianceDataFromTXT = new ReadApplianceDataFromTXT();
        String pathStr = System.getProperty("user.dir") + PATH_FILE;
        List<String> dataFromSource = null;
        List<Appliance> appliances = null;
        try {
            if (criteria.getGroupSearchName() != null) {
                dataFromSource = readApplianceDataFromTXT.readDataTXTByGroupName(pathStr, criteria.getGroupSearchName());
            } else {
                dataFromSource = readApplianceDataFromTXT.readAllDataTXT(pathStr);
            }
            ApplianceDataMatcher matcher = new ApplianceDataMatcher(dataFromSource, criteria);
            List<String> dataAfterMatching = matcher.match();
            ApplianceListCreator applianceListCreator = new ApplianceListCreator(dataAfterMatching);
            appliances = applianceListCreator.createApplianceList();
        } catch (Exception e) {
            throw new DAOException();
        }

        return appliances;
    }
}
