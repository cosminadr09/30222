package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal{
	public Insect(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}
	private Boolean canFly;
	private Boolean isDangerous;
	
	public Boolean getCanFly() {
		return this.canFly;
	}
	
	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}
	
	public Boolean getIsdangerous() {
		return this.isDangerous;
	}
	
	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	

}
