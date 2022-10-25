package com.epamjavaweb.task10class.taskappliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nameApp;

	public Appliance() {

	}

	public Appliance(String nameApp) {
		this.nameApp = nameApp;
	}

	public String getNameApp() {
		return nameApp;
	}

	public void setNameApp(String nameApp) {
		this.nameApp = nameApp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameApp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return Objects.equals(nameApp, other.nameApp);
	}

	@Override
	public String toString() {
		return "Appliance [nameApp=" + nameApp + "]";
	}
}