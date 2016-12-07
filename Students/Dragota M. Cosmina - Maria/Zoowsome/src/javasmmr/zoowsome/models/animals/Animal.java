package javasmmr.zoowsome.models.animals;

import java.util.Random;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;


//import javax.lang.model.element.Element;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Element;

public abstract class Animal implements Killer_I, XML_Parsable {
	/**
	 * it is an abstract class – you cannot create any instance of it, however
	 * it can contain non-abstract methods and can be extended
	 */
	private int noOfLegs;
	private String name;
	public final double maintenanceCost;// hold how many hours per week will
										// this animal require attention
										// from employees of the zoo.
	public final double dangerPerc;// This field will represent how dangerous
									// an animal is in %.
	private boolean takenCareOf = false;

	/**
	 * 
	 * final fields have to be initialized in a constructor and their values
	 * cannot be changed
	 * 
	 */

	public int getNoOfLegs() {
		return this.noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getMaintenanceCost(){
		return this.maintenanceCost;
	}
	
	
	public double getDangerPerc(){
		return this.dangerPerc;
	}
	
	

	/**
	 * Random random = new Random(); double value = min + (max - min) *
	 * random.nextDouble();
	 */
	@Override
	public boolean kill() {
		Random random = new Random();
		double number = 1 * random.nextDouble();// genereaza nr intre [0,1]
		if (number < dangerPerc) {
			return true;
		} else {
			return false;
		}
	}

	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

//	public Animal() {
//
//	}

	// am creat un constructor care va initializa final fields
	public Animal(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "noOfLegs", String.valueOf(this.noOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		}
	public void decodeFromXml(Element element) {
		setNoOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
		}

}
