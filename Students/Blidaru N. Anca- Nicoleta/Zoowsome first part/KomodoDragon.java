package javasmmr.zoowsome.models.animals;

public class KomodoDragon extends Reptile {

	public KomodoDragon(int nrOfLegs, String name, boolean laysEggs) {
		super(5, 1);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public KomodoDragon() {
		this(4, "KomodoDragon", true);
	}
}
