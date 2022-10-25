package com.epamjavaweb.task10class.taskappliance.dao.util;

import com.epamjavaweb.task10class.taskappliance.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDataMatcher {
    private List<String> dataFromSource;
    private Criteria criteria;

    public ApplianceDataMatcher(List<String> dataFromSource, Criteria criteria) {
        this.dataFromSource = dataFromSource;
        this.criteria = criteria;
    }

    public List<String> match() {
        List<String> applianceDataResult = new ArrayList<>();
        List<String> searchPatterns = addPatternsToList(criteria);
        for (String data : dataFromSource) {
            if (checkToPatterns(data, searchPatterns) == true) {
                applianceDataResult.add(data);
            }

        }
        return applianceDataResult;
    }

    private boolean checkToPatterns(String data, List<String> searchPatterns) {
        for (String pattern : searchPatterns) {
            if (!data.contains(pattern)) {
                return false;
            }
        }
        return true;

    }


    private ArrayList<String> addPatternsToList(Criteria criteria) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> item : criteria.getCriteria().entrySet()) {
            String line = item.getKey() + "=" + item.getValue();
            list.add(line);

        }
        return list;
    }
}

