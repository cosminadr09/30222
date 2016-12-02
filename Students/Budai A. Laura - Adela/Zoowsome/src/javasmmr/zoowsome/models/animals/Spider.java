package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	
	public Spider(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Spider(){
		this.setNrOfLegs(8);
		this.setName("Spider");
		this.setCanFly(false);
		this.setIsDangerous(true);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(1);
	}

}
