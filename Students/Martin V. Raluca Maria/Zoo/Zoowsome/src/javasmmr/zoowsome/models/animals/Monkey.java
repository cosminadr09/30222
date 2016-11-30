package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Monkey extends Mammal {
	public Monkey(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setNrOfLegs(nrOfLegs);;
		this.setPercBodyHair(percBodyHair);
	}
	
	public Monkey() {
		this(15, 80, "Monkyy", 4, 7.5, 0.4);
	}
	public boolean kill() {
		Random ran = new Random();
		int survive = ran.nextInt(10);
		if( (survive/10) < dangerPerc ) {
			return true;
		} 
		else {
			return false;
		}
	}

}
