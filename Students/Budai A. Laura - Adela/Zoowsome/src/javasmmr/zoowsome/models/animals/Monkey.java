package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	
	public Monkey(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Monkey(){
		this.setNrOfLegs(4);
		this.setName("Monkey");
		this.setNormalBodyTemp(37);
		this.setPercBodyHair(90);
		this.setMaintenanceCost(6.5);
		this.setDangerPerc(0.6);
	}
}
