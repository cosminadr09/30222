package javasmmr.zoowsome.models.animals;


public class Cockroach extends Insect {
	
	public Cockroach(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Cockroach(){
		this.setNrOfLegs(4);
		this.setName("Cockroach");
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.1);
	}
}
