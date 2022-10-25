package com.epamjavaweb.task10class.taskappliance.main;

import static com.epamjavaweb.task10class.taskappliance.entity.criteria.SearchCriteria.*;

import com.epamjavaweb.task10class.taskappliance.entity.Appliance;
import com.epamjavaweb.task10class.taskappliance.entity.criteria.Criteria;
import com.epamjavaweb.task10class.taskappliance.service.ApplianceService;
import com.epamjavaweb.task10class.taskappliance.service.ServiceException;
import com.epamjavaweb.task10class.taskappliance.service.ServiceFactory;
import com.epamjavaweb.task10class.taskappliance.view.OutputInfo;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ServiceException {

        List<Appliance> appliances;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ApplianceService applianceService = serviceFactory.getApplianceService();

        Criteria criteriaOven = new Criteria();
        criteriaOven.add(Oven.POWER_CONSUMPTION.name(), 1000);

        appliances = applianceService.find(criteriaOven);
        OutputInfo.printAboutAppliance(appliances);

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

        appliances = applianceService.find(criteriaTabletPC);

        OutputInfo.printAboutAppliance(appliances);

    }
}
