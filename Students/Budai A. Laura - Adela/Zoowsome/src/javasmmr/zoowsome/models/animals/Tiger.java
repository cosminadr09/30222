package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	public Tiger(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Tiger(){
		this.setNrOfLegs(4);
		this.setName("Tiger");
		this.setNormalBodyTemp(37);
		this.setPercBodyHair(90);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(7.5);
	}
}
