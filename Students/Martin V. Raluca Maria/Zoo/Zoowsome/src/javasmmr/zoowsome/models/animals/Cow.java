package javasmmr.zoowsome.models.animals;
import java.util.Random;


public class Cow extends Mammal {
	public Cow(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setNrOfLegs(nrOfLegs);
		this.setPercBodyHair(percBodyHair);
	}
	
	public Cow() {
		this(15, 40, "Stella", 4, 7.9, 0.6);
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
