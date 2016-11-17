package javasmmr.zoowesome.models.animals;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private enum waterType {SALTWATER, FRESHWATER};
	
	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
}
