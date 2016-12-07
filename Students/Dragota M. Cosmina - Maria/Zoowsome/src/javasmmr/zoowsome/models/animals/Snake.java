package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Snake extends Reptile{

	public Snake(int noOfLegs, String name, double maintenanceCost, double dangerPerc, boolean laysEggs) {
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
		
	}
	
	public Snake() {
		// TODO Auto-generated constructor stub
		this(0, "Anaconda", 2856463.9, 0.99, true);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Reptiles.SNAKE);
		}

}
