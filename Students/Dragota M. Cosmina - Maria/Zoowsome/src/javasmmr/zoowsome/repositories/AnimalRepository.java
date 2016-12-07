package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

import javax.swing.text.*;
import javax.xml.parsers.*;
import javax.xml.stream.events.*;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
	}

	public void save(ArrayList<Animal> animals) throws FileNotFoundException,
			XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// Create XMLEventWriter
		XMLEventWriter eventWriter = outputFactory
				.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		// Create a EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		// Create and write Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		// Create content open tag
		StartElement configStartElement = eventFactory.createStartElement("",
				"", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (Animal animal : animals) {
			StartElement sElement = eventFactory.createStartElement("", "",
					Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			animal.encodeToXml(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "",
					Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public static void createNode(XMLEventWriter eventWriter, String name,
			String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// Create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}

	public ArrayList<Animal> load() throws ParserConfigurationException,
			SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		((org.w3c.dom.Document) doc).getDocumentElement().normalize();
		NodeList nodeList = ((org.w3c.dom.Document) doc)
				.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				org.w3c.dom.Element element = (org.w3c.dom.Element) node;
				String discriminant = ((org.w3c.dom.Document) element)
						.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT)
						.item(0).getTextContent();
				switch (discriminant) {
				case Constants.Animals.Insects.BUTTERFLY:
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml((org.w3c.dom.Element) element);
					animals.add(butterfly);
				case Constants.Animals.Insects.CRICKET:
					Animal cricket = new Cricket();
					cricket.decodeFromXml((org.w3c.dom.Element) element);
					animals.add(cricket);
				case Constants.Animals.Insects.SPIDER:
					Animal spider = new Spider();
					spider.decodeFromXml((org.w3c.dom.Element) element);
					animals.add(spider);
				case Constants.Animals.Aquatics.DOLPHIN:
					Animal dolphin = new Dolphin();
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
				case Constants.Animals.Aquatics.SALMON:
					Animal salmon = new Salmon();
					salmon.decodeFromXml(element);
					animals.add(salmon);
				case Constants.Animals.Aquatics.WHALE:
					Animal whale = new Whale();
					whale.decodeFromXml(element);
					animals.add(whale);
				case Constants.Animals.Birds.DOVE:
					Animal dove = new Dove();
					dove.decodeFromXml(element);
					animals.add(dove);
				case Constants.Animals.Birds.EAGLE:
					Animal eagle = new Eagle();
					eagle.decodeFromXml(element);
					animals.add(eagle);
				case Constants.Animals.Birds.SWALLOW:
					Animal swallow = new Swallow();
					swallow.decodeFromXml(element);
					animals.add(swallow);
				case Constants.Animals.Mammals.HORSE:
					Animal horse = new Horse();
					horse.decodeFromXml(element);
					animals.add(horse);
				case Constants.Animals.Mammals.MONKEY:
					Animal monkey = new Monkey();
					monkey.decodeFromXml(element);
					animals.add(monkey);
				case Constants.Animals.Mammals.TIGER:
					Animal tiger = new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);
				case Constants.Animals.Reptiles.CROCODILE:
					Animal crocodile = new Crocodile();
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
				case Constants.Animals.Reptiles.LIZARD:
					Animal lizzard = new Lizard();
					lizzard.decodeFromXml(element);
					animals.add(lizzard);
				case Constants.Animals.Reptiles.SNAKE:
					Animal snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);

				default:
					break;
				}
			}
		}
		return animals;
	}
}
