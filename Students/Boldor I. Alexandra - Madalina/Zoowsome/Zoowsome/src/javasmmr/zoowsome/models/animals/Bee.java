package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Bee extends Insect{
	public Bee(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	public Bee() {
		this(6,"Albinuta",true,true,0.3,0.2);
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
