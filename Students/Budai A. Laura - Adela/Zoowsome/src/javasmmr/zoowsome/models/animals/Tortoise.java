package javasmmr.zoowsome.models.animals;

public class Tortoise extends Reptile{
	
	public Tortoise(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Tortoise(){
		this.setNrOfLegs(4);
		this.setName("Tortoise");
		this.setLaysEggs(true);
		this.setMaintenanceCost(1.5);
		this.setDangerPerc(0.4);
	}
}
