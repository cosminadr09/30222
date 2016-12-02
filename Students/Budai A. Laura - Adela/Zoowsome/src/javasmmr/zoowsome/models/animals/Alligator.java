package javasmmr.zoowsome.models.animals;


public class Alligator extends Reptile {
	
	public Alligator(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Alligator(){
		this.setNrOfLegs(4);
		this.setName("Alligator");
		this.setLaysEggs(true);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(6.5);
		}
}
