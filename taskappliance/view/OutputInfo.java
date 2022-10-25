package com.epamjavaweb.task10class.taskappliance.view;

import com.epamjavaweb.task10class.taskappliance.dao.util.ListAppliance;
import com.epamjavaweb.task10class.taskappliance.entity.Appliance;
import com.epamjavaweb.task10class.taskappliance.service.ServiceException;

import java.util.List;

public class OutputInfo {

    public OutputInfo() {
    }

    public static void printAboutAppliance(List<Appliance> applianceList) throws ServiceException {
        ListAppliance listApp;
        String propertiesLine;
        try {
            for (Appliance appliance : applianceList) {
                listApp = ListAppliance.valueOf(appliance.getNameApp().toUpperCase());
                propertiesLine = listApp.conversionType(appliance);
                System.out.println(propertiesLine);
            }
        } catch (Exception e) {
            throw new ServiceException("Incorrect data");
        }
    }
}
