package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Monkey extends Mammal{
	public Monkey(int nrOfLegs,String name,float normalBodyTemp,float percBodyHair, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Monkey() {
		this(4,"Maimutica",35,98,0.3,0.1);
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
