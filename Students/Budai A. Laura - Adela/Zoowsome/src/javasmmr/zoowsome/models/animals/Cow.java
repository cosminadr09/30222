package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	
	public Cow(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Cow(){
		this.setNrOfLegs(4);
		this.setName("Cow");
		this.setNormalBodyTemp(38);
		this.setPercBodyHair(70);
		this.setMaintenanceCost(0.4);
		this.setDangerPerc(0.2);
	}
}
