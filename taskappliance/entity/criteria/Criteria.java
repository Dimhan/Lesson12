package com.epamjavaweb.task10class.taskappliance.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Criteria {
	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	private int numberOfCriteria = 0;

	public Criteria() {
	}

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
		this.numberOfCriteria = 0;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public Map<String, Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<String, Object> criteria) {
		this.criteria = criteria;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
		numberOfCriteria++;
	}

	public int getNumberOfCriteria() {
		return numberOfCriteria;
	}

	public void setNumberOfCriteria(int numberOfCriteria) {
		this.numberOfCriteria = numberOfCriteria;
	}
}