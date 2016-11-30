package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{
	
	public Eagle(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Eagle(){
		this.setNrOfLegs(2);
		this.setName("Eagle");
		this.setMigrates(true);
		this.setAvgFlightAltitude(10000);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.6);
	}
}

