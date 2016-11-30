package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	public Caretaker(String name, BigDecimal salary, Boolean isDead) {
		super(name, salary, isDead);
		// TODO Auto-generated constructor stub
	}
	public Double workingHours;
	public void setWorkingHours( Double workingHours) {
		this.workingHours = workingHours;
	}
	public Double getWorkingHours() {
		return workingHours;
	}
	
	public String takeCareOf(Animal animal) {
		if( animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if( this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
}
