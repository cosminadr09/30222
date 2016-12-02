package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Stork extends Bird{
	public Stork(int nrOfLegs,String name,Boolean migrates,int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		getAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Stork() {
		this(2,"Barza",true,500,0.3,0.1);
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
