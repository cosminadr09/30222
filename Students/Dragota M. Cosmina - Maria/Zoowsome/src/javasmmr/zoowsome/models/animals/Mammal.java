package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

/**
 * pentru a initializa toate datele mostenite din clasa Animal, folosesc
 * constructorul super() constructorul unei clase abstracte se apeleaza de
 * fiecare data cand instantiez o clasa concreta
 * 
 * @author Cosmina
 *
 */
public abstract class Mammal extends Animal {

	private float normalBodyTemp;
	private float percBodyHair;

	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyHair() {
		return this.percBodyHair;
	}

	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp",
				String.valueOf(normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(percBodyHair));

	}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
		}

}
