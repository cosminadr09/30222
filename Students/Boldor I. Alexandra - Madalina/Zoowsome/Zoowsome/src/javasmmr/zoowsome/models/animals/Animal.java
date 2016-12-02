package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.models.Killer;

public abstract class Animal implements Killer{
		private int nrOfLegs;
		private String name;
		private Boolean takenCareOf ;
		final double maintenanceCost;
		final double dangerPerc;
		
		
		public Animal(double maintenanceCost, double dangerPerc) {
			this.maintenanceCost = maintenanceCost;
			this.dangerPerc = dangerPerc;
			this.takenCareOf = false;
		}
		
		public  int getNrOfLegs() {
			return this.nrOfLegs;
		}
		public  void setNrOfLegs(int nrOfLegs) {
			this.nrOfLegs=nrOfLegs;
		}
		public  String getName() {
			return this.name;
		}
		public  void setName(String name) {
			this.name=name;
		}
		public Boolean getTakenCareOf() {
			return this.takenCareOf;
		}
		public void setTakenCareOf(Boolean takenCareOf) {
			this.takenCareOf=takenCareOf;
		}
		public double getMaintenanceCost() {
			return this.maintenanceCost;
		}
		
		public double getDangerPerc() {
			return this.dangerPerc;
		}
		
		
}
