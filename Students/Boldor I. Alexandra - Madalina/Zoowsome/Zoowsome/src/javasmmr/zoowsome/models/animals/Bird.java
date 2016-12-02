package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private int avgFlightAltitude;
	
	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public Boolean isMigrating() {
		return this.migrates;
	}
	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}
	public float getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
	public void getAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

}
