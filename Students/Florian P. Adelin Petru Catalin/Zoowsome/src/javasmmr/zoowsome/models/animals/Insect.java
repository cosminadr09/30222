package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	public Insect(Double maintenanceCost,Double dangerPerc) {
		super(maintenanceCost,dangerPerc);
	}
	public boolean canFly;
	public boolean isDangerous;
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
