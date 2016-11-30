package javasmmr.zoowsome.models.animals;

public class Pinguin extends Bird {
	
	public Pinguin(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Pinguin(){
		this.setNrOfLegs(2);
		this.setName("Butterfly");
		this.setMigrates(false);
		this.setAvgFlightAltitude(0);
		this.setMaintenanceCost(2.5);
		this.setDangerPerc(0.2);
	}
}
