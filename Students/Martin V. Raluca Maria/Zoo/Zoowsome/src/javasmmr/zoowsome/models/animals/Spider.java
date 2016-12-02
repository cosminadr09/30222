package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Spider extends Insect {
	public Spider(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs);
	}		
	public Spider() {
		this(true, true, "Spidy", 8, 5.5, 1.0);
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
