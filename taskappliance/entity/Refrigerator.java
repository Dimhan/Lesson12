package com.epamjavaweb.task10class.taskappliance.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {
	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private int overallCapacity;
	private double height;
	private double width;

	public Refrigerator() {
		super();
	}

	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, int overallCapacity, double height,
			double width) {
		super("Refrigerator");
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Refrigerator that = (Refrigerator) o;
		return powerConsumption == that.powerConsumption && weight == that.weight &&
				freezerCapacity == that.freezerCapacity && overallCapacity == that.overallCapacity &&
				height == that.height && width == that.width;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
	}

	@Override
	public String toString() {
		return "Refrigerator{" +
				"powerConsumption=" + powerConsumption +
				", weight=" + weight +
				", freezerCapacity=" + freezerCapacity +
				", overallCapacity=" + overallCapacity +
				", height=" + height +
				", width=" + width +
				'}';
	}
}