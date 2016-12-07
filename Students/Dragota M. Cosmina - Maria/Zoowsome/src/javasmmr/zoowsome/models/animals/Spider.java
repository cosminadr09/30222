package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Spider extends Insect {

	
	public Spider(int NoOfLegs, String name, double maintenanceCost, double dangerPerc, boolean canFly, boolean isDangerous){
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(NoOfLegs);
		setName(name);
		setCanFLy(canFly);
		setIsDangerous(isDangerous);
	}
	
	public Spider() {
		// TODO Auto-generated constructor stub
		this(8, "Vaduva neagra", 10.45, 0.60, false, true);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Insects.SPIDER);
		}

}
