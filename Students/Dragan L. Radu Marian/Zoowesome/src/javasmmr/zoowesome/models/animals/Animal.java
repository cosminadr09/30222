package javasmmr.zoowesome.models.animals;
import java.util.Random;
import interfaces.Killer_I;

public abstract class Animal implements Killer_I{
	private Integer nrOfLegs = 0;
	private String name ;
	private final Double maintenanceCost; //  How can I restrict this
										  // between 0.1 and 8.0 ?
	private final Double dangerPerc;	  //  Also this between 0 and 1?
	private Boolean takenCareOf;
	
	Random random = new Random();
	
	public boolean kill() {
		if(random.nextDouble() >= dangerPerc) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public Animal() {
		this.maintenanceCost = 4.8;
		this.dangerPerc = 0.5;
		this.takenCareOf = false;
	}
	
	public Double getMaintanceCost() {
		return maintenanceCost;
	}
	
	public Double getDangerPerc() {
		return dangerPerc;
	}
	
	public Animal(Double maintanceCost, Double dangerPerc) {
		this.maintenanceCost = maintanceCost;
		this.dangerPerc = dangerPerc;
	}
	
	public void setNrOfLegs( int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	
	public void setName( String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Boolean getTakenCareOf() {
		return takenCareOf;
	}
	
	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
}

