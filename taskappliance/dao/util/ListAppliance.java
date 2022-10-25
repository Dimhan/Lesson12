package com.epamjavaweb.task10class.taskappliance.dao.util;

import com.epamjavaweb.task10class.taskappliance.entity.*;

public enum ListAppliance {
    OVEN {
        public Appliance creatorObjAppliance(String[] suiteProperties) {

            int powerConsumption = Integer.parseInt(suiteProperties[2]);
            int weight = Integer.parseInt(suiteProperties[4]);
            int capacity = Integer.parseInt(suiteProperties[6]);
            int depth = Integer.parseInt(suiteProperties[8]);
            double height = Double.parseDouble(suiteProperties[10]);
            double width = Double.parseDouble(suiteProperties[12]);

            return new Oven(powerConsumption, weight, capacity, depth, height, width);

        }
        public String conversionType (Appliance appliance) {
            Oven oven = (Oven) appliance;
            return oven.toString();
        }
    },
    LAPTOP {
        public Appliance creatorObjAppliance(String[] suiteProperties) {

            int batteryCapacity = Integer.parseInt(suiteProperties[2]);
            String os = suiteProperties[4];
            int memoryRom = Integer.parseInt(suiteProperties[6]);
            int systemMemory = Integer.parseInt(suiteProperties[8]);
            double cpu = Double.parseDouble(suiteProperties[10]);
            double displayInchs = Double.parseDouble(suiteProperties[12]);

            return new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
        }
        public String conversionType (Appliance appliance) {
            Laptop laptop = (Laptop) appliance;
            return laptop.toString();
        }
    },
    REFRIGERATOR {
        public Appliance creatorObjAppliance(String[] suiteProperties) {

            int powerConsumption = Integer.parseInt(suiteProperties[2]);
            int weight = Integer.parseInt(suiteProperties[4]);
            int freezerCapacity = Integer.parseInt(suiteProperties[6]);
            int overallCapacity = Integer.parseInt(suiteProperties[8]);
            double height = Double.parseDouble(suiteProperties[10]);
            double width = Double.parseDouble(suiteProperties[12]);

            return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
        }
        public String conversionType (Appliance appliance) {
            Refrigerator refrigerator = (Refrigerator) appliance;
            return refrigerator.toString();
        }

    },
    TABLETPC {
        public Appliance creatorObjAppliance(String[] suiteProperties) {

            int batteryCapacity = Integer.parseInt(suiteProperties[2]);
            int displayInches = Integer.parseInt(suiteProperties[4]);
            int memoryRom = Integer.parseInt(suiteProperties[6]);
            int flashMemoryCapacity = Integer.parseInt(suiteProperties[8]);
            String color = suiteProperties[10];

            return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
        }

        public String conversionType (Appliance appliance) {
            TabletPC tabletPC = (TabletPC) appliance;
            return tabletPC.toString();
        }

    },
    VACUUMCLEANER {
        public Appliance creatorObjAppliance(String[] suiteProperties) {

            int powerConsumption = Integer.parseInt(suiteProperties[2]);
            String filterType = suiteProperties[4];
            String bagType = suiteProperties[6];
            String wandType = suiteProperties[8];
            int motorSpeedRegulation = Integer.parseInt(suiteProperties[10]);
            int cleaningWidth = Integer.parseInt(suiteProperties[12]);

            return new VacuumCleaner(powerConsumption, filterType, bagType,
                    wandType, motorSpeedRegulation, cleaningWidth);
        }

        public String conversionType (Appliance appliance) {
            VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
            return vacuumCleaner.toString();
        }

    },
    SPEAKERS {
        public Appliance creatorObjAppliance(String[] suiteProperties) {

            int powerConsumption = Integer.parseInt(suiteProperties[2]);
            int numberOfSpeakers = Integer.parseInt(suiteProperties[4]);
            String frequencyRange = suiteProperties[6];
            int cordLength = Integer.parseInt(suiteProperties[8]);


            return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
        }

        public String conversionType (Appliance appliance) {
            Speakers speakers = (Speakers) appliance;
            return speakers.toString();
        }

    };

    public abstract Appliance creatorObjAppliance(String[] suiteProperties);
    public abstract String conversionType(Appliance appliance);
}
