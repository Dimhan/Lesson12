package com.epamjavaweb.task10class.taskappliance.entity;

import java.util.Objects;

public class Laptop extends Appliance {
	private static final long serialVersionUID = 1L;

	private int batteryCapacity;
	private String os;
	private int memoryRom;
	private int systemMemory;
	private double cpu;
	private double displayInchs;

	public Laptop() {
		super();
	}

	public Laptop(int batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, double displayInchs) {
		super("Laptop");
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(double displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Laptop laptop = (Laptop) o;
		return batteryCapacity == laptop.batteryCapacity && memoryRom == laptop.memoryRom &&
				systemMemory == laptop.systemMemory && Double.compare(laptop.cpu, cpu) == 0 &&
				Double.compare(laptop.displayInchs, displayInchs) == 0 && os.equals(laptop.os);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
	}

	@Override
	public String toString() {
		return "Laptop{" +
				"batteryCapacity=" + batteryCapacity +
				", os='" + os + '\'' +
				", memoryRom=" + memoryRom +
				", systemMemory=" + systemMemory +
				", cpu=" + cpu +
				", displayInchs=" + displayInchs +
				'}';
	}
}