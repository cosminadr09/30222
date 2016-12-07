package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Salmon extends Aquatic{

	public Salmon(int noOfLegs, String name, double maintainCost, double dangerPerc, int avgSwimDepth, Water waterType){
		super(maintainCost, dangerPerc, avgSwimDepth, waterType);
		setNoOfLegs(noOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);		
	}
	
	public Salmon() {
		// TODO Auto-generated constructor stub
		this(0, "Somon", 104.29, 0.1, 50, Water.FRESHWATER);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Aquatics.SALMON);
		}

}
