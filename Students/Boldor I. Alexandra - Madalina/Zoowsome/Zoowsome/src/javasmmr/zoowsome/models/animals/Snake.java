package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Snake extends Reptile {
	public Snake(int nrOfLegs,String name,Boolean laysEggs, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Snake() {
		this(0,"Sarpe",true,0.5,1);
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
