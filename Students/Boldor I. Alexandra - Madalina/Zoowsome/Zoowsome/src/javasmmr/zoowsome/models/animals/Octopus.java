package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Octopus extends Aquatic {
	public Octopus(int nrOfLegs,String name,int avgSwimDepth,water waterType, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);	
	}
	
	public Octopus() {
		this(8,"Caracatita",1000,water.saltwater,0.5,1);
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
