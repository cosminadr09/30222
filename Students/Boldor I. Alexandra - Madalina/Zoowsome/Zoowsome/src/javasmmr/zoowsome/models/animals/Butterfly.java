package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs,String name,Boolean canFly,Boolean isDangerous,double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	public Butterfly() {
		this(6,"Fluturas",true,false,0.1,0.8);
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
