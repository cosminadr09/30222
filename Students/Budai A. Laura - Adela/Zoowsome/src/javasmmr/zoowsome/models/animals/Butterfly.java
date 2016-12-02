package javasmmr.zoowsome.models.animals;


public class Butterfly extends Insect {
	
	public Butterfly(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Butterfly() {
		this.setNrOfLegs(4);
		this.setName("Butterfly");
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.1);
	}
}
