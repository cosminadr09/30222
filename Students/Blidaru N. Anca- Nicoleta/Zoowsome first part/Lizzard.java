package javasmmr.zoowsome.models.animals;

public class Lizzard extends Reptile {

	public Lizzard(int nrOfLegs, String name, boolean laysEggs) {
		super(3, 0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public Lizzard() {
		this(4, "Iguana", true);
	}
}
