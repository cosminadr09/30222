package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(int nrOfLegs, String name, Integer avgSwimDepth, water waterType) {
		super(5, 1);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

	public Shark() {
		this(0, "BigShark", 1500, water.saltWater);
	}
}
