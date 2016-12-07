package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Horse extends Mammal{
	
	public Horse(int noOfLegs, String name, double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair){
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public Horse() {
		// TODO Auto-generated constructor stub
		this(4, "Mustang", 1923.3856, 0.89, 70, 61);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Mammals.HORSE);
		}

}
