package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Dove extends Bird{//porumbel

	public Dove(double maintenanceCost, double dangerPerc, int noOfLegs, String name, boolean migrates, int avgFlightAltitude){
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Dove() {
		// TODO Auto-generated constructor stub
		this(20.13, 0.1, 2, "Porumbel", false, 30);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Birds.DOVE);
		}

}
