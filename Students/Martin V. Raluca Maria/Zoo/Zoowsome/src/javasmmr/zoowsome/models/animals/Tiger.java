package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Tiger extends Mammal {
	
	public Tiger( float normalBodyTemp, float percBodyHair, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setNrOfLegs(nrOfLegs);
		this.setPercBodyHair(percBodyHair);
	}	
	
	public Tiger() {
		this(15, 80, "Tigy", 4, 8.0, 1.0);
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
