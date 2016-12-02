package javasmmr.zoowsome.models.animals;


public class Chameleon extends Reptile{
	
	public Chameleon(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Chameleon(){
		this.setNrOfLegs(4);
		this.setName("Chameleon");
		this.setLaysEggs(true);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.3);
	}
}