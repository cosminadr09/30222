package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Crocodile extends Reptile {
	public Crocodile(int nrOfLegs,String name,Boolean laysEggs, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Crocodile() {
		this(4,"Crocodil",true,0.2,0.9);
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
