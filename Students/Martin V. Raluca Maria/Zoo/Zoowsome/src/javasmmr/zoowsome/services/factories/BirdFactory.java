package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if ( Constants.Animals.Birds.Flamingo.equals(type) ) {
			return new Flamingo();
		} else if ( Constants.Animals.Birds.Gull.equals(type) ) {
			return new Gull();
		} else if ( Constants.Animals.Birds.Turacos.equals(type) ) {
			return new Turacos();
		} else {
			throw new Exception("Invalid animal exception!");
	}

}
}