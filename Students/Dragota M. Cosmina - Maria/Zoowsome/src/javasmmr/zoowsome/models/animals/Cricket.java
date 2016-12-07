package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.*;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


public class Cricket extends Insect{

	public Cricket(int NoOfLegs, String name, double maintenanceCost, double dangerPerc, boolean canFly, boolean isDangerous){
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(NoOfLegs);
		setName(name);
		setCanFLy(canFly);
		setIsDangerous(isDangerous);
		
	}
	
	public Cricket() {
		// TODO Auto-generated constructor stub
		this(6, "Greiere",8.0, 0.0001, true, false);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Insects.CRICKET);
		}

}
