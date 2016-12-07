package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Aquatic extends Animal {

	private int avgSwimDepth;

	public enum Water {
		SALTWATER, FRESHWATER
	};

	/**
	 * Enums are classes Instances of an enum are constants and should follow
	 * the conventions for constants.
	 */
	private Water waterType;

	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Water getWaterType() {
		return this.waterType;
	}

	public void setWaterType(Water waterType) {
		this.waterType = waterType;
	}

	// public Aquatic(){

	// }
	public Aquatic(double maintainCost, double dangerPerc, int avgSwimDept,
			Water waterType) {
		super(maintainCost, dangerPerc);
		this.avgSwimDepth = avgSwimDept;
		this.waterType = waterType;
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(avgSwimDepth));
		createNode(eventWriter, "waterType", String.valueOf(waterType));

	}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		}
}
