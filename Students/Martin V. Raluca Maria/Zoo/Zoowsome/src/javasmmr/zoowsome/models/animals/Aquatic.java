package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	
	public Aquatic(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private int avgSwimDepth;
	private enum waterType {
		ocean, sea, lake, river
	}
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth( int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	

}
