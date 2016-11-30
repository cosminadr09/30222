package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	int avgSwimDepth;
	enum waterType{saltwater, freshwater};
	waterType water;
	
	public int getAvgSwimDepth() {
		return this.avgSwimDepth;	
	}
	
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public waterType getWaterType() {
		return this.water;	
	}
	
	public void setWaterType(waterType water) {
       this.water = water;
    }
	
}