package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Turacos extends Bird {
	public Turacos(Boolean migrates, int avgFlightAltitude, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates); 
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs);
	}
	public Turacos() {
		this(false, 500, "Tury", 2, 6.7, 0.2);
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
