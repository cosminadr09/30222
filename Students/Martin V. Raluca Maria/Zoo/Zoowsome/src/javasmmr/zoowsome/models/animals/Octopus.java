package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Octopus extends Aquatic {
	public Octopus(int avgSwimDepth, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setAvgSwimDepth(avgSwimDepth); 
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs); 
	}
	public Octopus() {
		this(100, "Octy", 8, 0.3, 6.4);
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
