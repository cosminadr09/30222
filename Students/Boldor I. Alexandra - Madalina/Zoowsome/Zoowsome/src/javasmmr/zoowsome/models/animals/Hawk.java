package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Hawk extends Bird {
	public Hawk(int nrOfLegs,String name,Boolean migrates,int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		getAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Hawk() {
		this(2,"Soim",false,1800,0.5,0.2);
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
