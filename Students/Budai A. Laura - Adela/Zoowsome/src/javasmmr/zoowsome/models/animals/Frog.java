package javasmmr.zoowsome.models.animals;

public class Frog extends Aquatic {
	
	public Frog(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Frog(){
		this.setNrOfLegs(4);
		this.setName("Frog");
		this.setAvgSwimDepth(66);
		this.setWaterType(waterType.freshwater);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.4);
	}
}
