package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	
	public Whale(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Whale(){
		this.setNrOfLegs(0);
		this.setName("Whale");
		this.setAvgSwimDepth(900);
		this.setWaterType(waterType.saltwater);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.9);
	}
}
