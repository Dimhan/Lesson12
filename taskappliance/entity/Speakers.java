package com.epamjavaweb.task10class.taskappliance.entity;

import java.util.Objects;

public class Speakers extends Appliance {
	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;

	public Speakers() {
		super();
	}

	public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
		super();
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Speakers speakers = (Speakers) o;
		return powerConsumption == speakers.powerConsumption && numberOfSpeakers == speakers.numberOfSpeakers &&
				cordLength == speakers.cordLength && frequencyRange.equals(speakers.frequencyRange);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
	}

	@Override
	public String toString() {
		return "Speakers{" +
				"powerConsumption=" + powerConsumption +
				", numberOfSpeakers=" + numberOfSpeakers +
				", frequencyRange='" + frequencyRange + '\'' +
				", cordLength=" + cordLength +
				'}';
	}
}