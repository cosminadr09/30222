package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Snake extends Reptile{
	public Snake(Boolean laysEggs, String name, int nrOflegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setLaysEggs(laysEggs); 
		this.setName(name); 
		this.setNrOfLegs(nrOflegs);
	}	
	public Snake() {
		this(true, "Snicky", 0, 4.3, 1.0);
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
