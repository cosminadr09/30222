package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(1, 0.8);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Spider() {
		this(10, "Tarantula", false, true);
	}
}
