package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {
	
	public Owl(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Owl(){
		this.setNrOfLegs(2);
		this.setName("Owl");
		this.setMigrates(false);
		this.setAvgFlightAltitude(2000);
		this.setMaintenanceCost(2.5);
		this.setDangerPerc(0.2);
	}
}
