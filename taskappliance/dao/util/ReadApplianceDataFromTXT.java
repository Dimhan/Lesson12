package com.epamjavaweb.task10class.taskappliance.dao.util;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadApplianceDataFromTXT {

    public ReadApplianceDataFromTXT() {

    }

    public List<String> readAllDataTXT(String pathFile)  {

        Path path = Path.of(pathFile);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public List<String> readDataTXTByGroupName (String pathFile, String groupName) {
        List<String> linesByGroupName = new ArrayList<>();
        for (String lineFromFile : readAllDataTXT(pathFile)) {
            if (lineFromFile.contains(groupName)) {
                linesByGroupName.add(lineFromFile);
            }
        }
        return linesByGroupName;
    }
}
