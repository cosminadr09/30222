package models.animals;

public abstract class Mammal extends Animal {

	protected float normalBodytemp;
	protected float percBodyHair;
	
	
	public float getNormalBodytemp() {
		return normalBodytemp;
	}
	
	public void setNormalBodytemp(float normalBodytemp) {
		this.normalBodytemp = normalBodytemp;
	}
	
	public float getPercBodyHair() {
		return percBodyHair;
	}
	
	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
	
}
