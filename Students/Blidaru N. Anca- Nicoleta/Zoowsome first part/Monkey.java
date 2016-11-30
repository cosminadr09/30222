package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {

	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {

		super(5, 0.4);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public Monkey() {
		this(2, "Gorilla", 39, 80);
	}
}
