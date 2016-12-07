package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Eagle extends Bird{

	public Eagle(int noOfLegs, String name, double maintenanceCost, double dangerPerc, boolean migrates, int avgFlightAltitude) {
		super( maintenanceCost,  dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		
	}
	
	public Eagle(){
		this(2, "Vultur", 1387.3, 0.90, false, 450);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Birds.EAGLE);
		}
}
