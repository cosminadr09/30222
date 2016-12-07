package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Dolphin extends Aquatic{

//	public Dolphin (int noOfLegs, String name, int avgSwimDepth, Water waterType) {
//		setNoOfLegs(noOfLegs);
//		setName(name);
//		setAvgSwimDepth(avgSwimDepth);
//		setWaterType(waterType);
		
//	}
	public Dolphin(int noOfLegs, String name, double maintainCost, double dangerPerc, int avgSwimDept, Water waterType){
		super(maintainCost, dangerPerc, avgSwimDept, waterType);
		setNoOfLegs(noOfLegs);
		setName(name);
	}
	public Dolphin() {
		// TODO Auto-generated constructor stub
		//this(0, "Delfinul de Amazon", 150, Water.SALTWATER);
		this(0, "Delfin", 12.3, 0.12, 150, Water.SALTWATER);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Aquatics.DOLPHIN);
		}

}
