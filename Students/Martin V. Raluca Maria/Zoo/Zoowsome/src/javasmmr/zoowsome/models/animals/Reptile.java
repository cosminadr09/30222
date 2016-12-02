package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	
	public Reptile(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}
	private Boolean laysEggs;
	
	public Boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
