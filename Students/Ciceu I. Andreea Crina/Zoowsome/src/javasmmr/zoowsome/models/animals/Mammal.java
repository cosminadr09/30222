package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
		public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		
	}
		private float normalBodyTemp;
		private float percBodyHair;
		
		public float getNormalBodyTemp() {
			return this.normalBodyTemp;
		}
		public void setNormalBodyTemp(float normalBodyTemp) {
			this.normalBodyTemp = normalBodyTemp;
		}
		public float getPercBodyHair() {
			return this.percBodyHair;
		}
		public void setPercBodyHair( float percBodyHair) {
			this.percBodyHair = percBodyHair;
		}
}
