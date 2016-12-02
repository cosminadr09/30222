package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Turtle extends Reptile {
	public Turtle(int nrOfLegs,String name,Boolean laysEggs, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Turtle() {
		this(4,"Broscuta",true,0.5,0.1);
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
