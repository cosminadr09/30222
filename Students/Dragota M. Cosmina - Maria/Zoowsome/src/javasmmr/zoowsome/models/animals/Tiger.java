package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Tiger extends Mammal{

	public Tiger(int noOfLegs, String name, double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair) {//toate atr cu set
		// TODO Auto-generated constructor stub
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	public Tiger() {
		this(4, "Tigru bengalez", 29355.56, 0.9, 50, 90); 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Mammals.TIGER);
		}

}
