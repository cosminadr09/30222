package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Flamingo extends Bird {
	public Flamingo(Boolean migrates, int avgFlightAltitude, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setAvgFlightAltitude(avgFlightAltitude); 
		this.setMigrates(migrates); 
		this.setName(name);
		this.setNrOfLegs(nrOfLegs); 
	}

	public Flamingo() {
		this(false, 150, "Flamy", 2, 6.4, 0.2);
	}
	public boolean kill() {
		Random ran = new Random();
		int survive = ran.nextInt(10);
		if( (survive/10) < dangerPerc ) {
			return true;
		} 
		else {
			return false;
		}
	}

}
