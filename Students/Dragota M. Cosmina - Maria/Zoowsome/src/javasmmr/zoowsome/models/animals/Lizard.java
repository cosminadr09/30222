package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Lizard extends Reptile{

	public Lizard(int noOfLegs, String name, double maintenanceCost, double dangerPerc,  boolean laysEggs) {
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
		// TODO Auto-generated constructor stub
	}
	public Lizard() {
		// TODO Auto-generated constructor stub
		this(4, "Salamandra", 129.08, 0.20, true);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Reptiles.LIZARD);
		}
}
