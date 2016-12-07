package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	private double workingHours;

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public Caretaker() {
		super();
	}

	public Caretaker(double workingHours) {
		super();
		setWorkingHours(workingHours);
	}

	public String takeCareOf(Animal a) {
		if (a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		this.setWorkingHours(this.workingHours - a.maintenanceCost);
		return Constants.Employees.Caretakers.TCO_SUCCESS;

	}
}
