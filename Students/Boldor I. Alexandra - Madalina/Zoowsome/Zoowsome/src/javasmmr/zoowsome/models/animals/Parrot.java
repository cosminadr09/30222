package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Parrot extends Bird {
	public Parrot(int nrOfLegs,String name,Boolean migrates,int avgFlightAltitude, double maintenanceCost, double dangerPerc ) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		getAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Parrot() {
		this(2,"Papagal",false,1200,0.1,0.1);
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
