package com.epamjavaweb.task10class.taskappliance.dao.util;

import com.epamjavaweb.task10class.taskappliance.dao.DAOException;
import com.epamjavaweb.task10class.taskappliance.entity.Appliance;

import java.util.ArrayList;
import java.util.List;

public class ApplianceListCreator {
    private final String DELIMITER = "\\s*(\\s|,|:|=)\\s*";

private final List<String> dataAfterMatching;

    public ApplianceListCreator(List<String> dataAfterMatching) {
        this.dataAfterMatching = dataAfterMatching;
    }

    public List<Appliance> createApplianceList() {
        List<Appliance> appliances = new ArrayList<>();
        for(String lineWithProperties : dataAfterMatching) {
            appliances.add(createApplianceObj(lineWithProperties));
        }
        return appliances;

    }

    private Appliance createApplianceObj(String lineWithProperties) {

        ListAppliance app;
        Appliance applianceObj;
        String[] suiteProperties = lineWithProperties.split(DELIMITER);
        app = ListAppliance.valueOf(suiteProperties[0].toUpperCase());
        applianceObj = app.creatorObjAppliance(suiteProperties);

        return applianceObj;
    }
}
