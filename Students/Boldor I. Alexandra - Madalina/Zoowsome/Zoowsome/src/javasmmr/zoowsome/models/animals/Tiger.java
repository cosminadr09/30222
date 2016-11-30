package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Tiger extends Mammal {
	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc ) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Tiger() {
		this(4,"Tigru",38,95,0.2,0.8);
	}
	
	@Override
	public boolean kill() {
		Random random =new Random();
		double number=random.nextDouble();
		if ( number < dangerPerc ) {
			return true;
		}
		return false;
	}
}
