package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private Integer avgSwimDepth;

	public enum water {
		saltWater, freshWater
	};

	private water waterType;

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public water getWaterType() {
		return waterType;
	}

	public void setWaterType(water waterType) {
		this.waterType = waterType;
	}
}
