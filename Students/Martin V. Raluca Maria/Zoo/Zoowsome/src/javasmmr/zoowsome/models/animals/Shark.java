package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Shark extends Aquatic {
	public Shark(int avgSwimDepth, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs);
	}
	public Shark() {
		this(110, "Sharky", 3, 5.8, 1.0);
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
