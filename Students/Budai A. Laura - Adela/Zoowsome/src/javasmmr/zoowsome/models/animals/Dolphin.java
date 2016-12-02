package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	
	public Dolphin(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Dolphin(){
		this.setNrOfLegs(0);
		this.setName("Dolphin");
		this.setAvgSwimDepth(300);
		this.setWaterType(waterType.saltwater);
		this.setMaintenanceCost(5.5);
		this.setDangerPerc(0.1);
	}
}
