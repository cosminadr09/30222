package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer_I {
	private Integer nrOfLegs;
	private String name;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean  takenCareOf ;
	
	
	public Integer getNrOfLegs(){
		return this.nrOfLegs;	
	}
	
	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName(){
		return this.name;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public final double getMaintenanceCost(){
		return this.maintenanceCost;
	}
	
	public final void setMaintenanceCost(double maintenanceCost){
		this.maintenanceCost = maintenanceCost;
	}
	
	public final double getDangerPerc(){
		return this.dangerPerc;
	}
	
	public final void setDangerPerc(double dangerPerc){
		this.dangerPerc = dangerPerc;
	}
	
	public boolean getTakenCareOf(){
		return this.takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	
	
	public boolean kill() {
		Random random = new Random();
		Double Result = random.nextDouble();
		if(Result < dangerPerc)
			return true;
		return false;
	}
}