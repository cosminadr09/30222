package javasmmr.zoowsome.models.animals;


public abstract class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	public final Double maintenanceCost;
	public final Double dangerPerc;
	public boolean takenCareOf = false;
	
	public Animal( Double maintenanceCost, Double dangerPerc){
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

	public void setTakenCareOf( boolean takenCareOf ) {
		this.takenCareOf = takenCareOf;
	}
	
	public boolean getTakenCareOf() {
		return takenCareOf;
	}
	
	
	public Double getMaintenanceCost() {
		return maintenanceCost;
	}
	
	public Double getDangerPerc() {
		return dangerPerc;
	}	
	public double getPredisposition() {
		return 0;
	}

	
	
	

	
}
