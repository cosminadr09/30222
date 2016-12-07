package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

//import javasmmr.zoowsome.models.animals.Aquatic.Water;

public class Whale extends Aquatic{

	public Whale(int noOfLegs, String name, double maintainCost, double dangerPerc, int avgSwimDept, Water waterType) {
		super(maintainCost, dangerPerc, avgSwimDept, waterType);
		setNoOfLegs(noOfLegs);
		setName(name);

		
	}
	
	public Whale() {
		// TODO Auto-generated constructor stub
		this(0, "Balena albastra", 184635.28475, 0.80, 900, Water.SALTWATER);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Aquatics.WHALE);
		}

}
