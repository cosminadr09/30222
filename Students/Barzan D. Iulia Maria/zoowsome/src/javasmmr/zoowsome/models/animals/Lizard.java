package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {
	public Lizard ( Integer nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs( nrOfLegs) ;
		setName ( name ) ;
		setLaysEggs ( laysEggs ) ;
	}
	
	public Lizard (){
		this ( 4, "Blaberoidea", true );
	}

}
