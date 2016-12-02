package javasmmr.zoowsome.models.animals;
import java.util.Random;

public class Lizzard extends Reptile{
	public Lizzard(Boolean laysEggs, String name, int nrOflegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setLaysEggs(laysEggs); 
		this.setName(name); 
		this.setNrOfLegs(nrOflegs);
	}
		
	public Lizzard() {
		this(true, "Lizzy", 4, 0.4, 0.2);
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
