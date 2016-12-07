package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Crocodile extends Reptile{

	public Crocodile(int noOfLegs, String name, double maintenanceCost, double dangerPerc, boolean laysEggs){
		super(maintenanceCost, dangerPerc);
		setNoOfLegs(noOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Crocodile() {//apelez constructorul cu parametri
		// TODO Auto-generated constructor stub
		this(4, "Crocodilul de Nil", 3856.56, 0.999, true);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Reptiles.CROCODILE);
		}

}
