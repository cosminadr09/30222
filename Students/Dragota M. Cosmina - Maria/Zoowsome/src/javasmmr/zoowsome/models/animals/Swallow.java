package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Swallow extends Bird{ //randunica

	public Swallow(int noOfLegs, String name, double maintenanceCost, double dangerPerc, boolean migrates, int avgFlightAltitude){
		super( maintenanceCost,  dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude); 
	
	}
	
	public Swallow(){
		this(2, "Randunica", 192.3, 0.001, true, 58);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Birds.SWALLOW);
		}

}
