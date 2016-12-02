package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {

	public Owl(int nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		super(2, 0.1);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Owl() {
		this(2, "Owl", true, 500);
	}
}
