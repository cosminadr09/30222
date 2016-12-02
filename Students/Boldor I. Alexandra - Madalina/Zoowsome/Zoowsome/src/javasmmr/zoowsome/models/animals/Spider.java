package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Spider extends Insect {
	public Spider(int nrOfLegs,String name,Boolean canFly,Boolean isDangerous, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	public Spider() {
		this(8,"Paianjen",false,true,0.2,0.2);
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
