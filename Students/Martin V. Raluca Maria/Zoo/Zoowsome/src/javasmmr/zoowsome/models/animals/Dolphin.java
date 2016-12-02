package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Dolphin extends Aquatic{
	public Dolphin(int avgSwimDepth, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}

	public Dolphin() {
		this(60, "Dolphy", 3, 7.0, 0.4);
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
