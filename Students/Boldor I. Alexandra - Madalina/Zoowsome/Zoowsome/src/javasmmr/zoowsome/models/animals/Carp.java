package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Carp extends Aquatic{
	public Carp(int nrOfLegs,String name,int avgSwimDepth,water waterType, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);	
	}
	
	public Carp() {
		this(0,"Crap",40,water.freshwater,0.1,0.1);
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
