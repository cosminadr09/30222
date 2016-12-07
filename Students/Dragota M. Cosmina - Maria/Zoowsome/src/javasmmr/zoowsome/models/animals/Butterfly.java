package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.*;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


public class Butterfly extends Insect{

	public Butterfly(int noOfLegs, String name, double maintenanceCost, double dangerPerc, boolean canFly, boolean isDangerous){
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setIsDangerous(isDangerous);
	}
	
	public Butterfly() {
		// TODO Auto-generated constructor stub
		this(0, "Coada-randunicii",375.45, 0.293, true, false);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Insects.BUTTERFLY);
		}

}
