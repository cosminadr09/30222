package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Jellyfish extends Aquatic{
	public Jellyfish(int nrOfLegs,String name,int avgSwimDepth,water waterType, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);	
	}
	
	public Jellyfish() {
		this(8,"Meduza",800,water.saltwater,0.2,0.1);
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
