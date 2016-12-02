package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Exception {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);

		/*
		 * Zoowsome first part
		 */
		// twist1

		int newAnimal;
		Animal[] animal = new Animal[Constants.ZOO_DIMENSION + 1];
		Random random = new Random();

		for (int i = 1; i <= Constants.ZOO_DIMENSION; i++) {

			newAnimal = random.nextInt(Constants.NR_OF_ANIMALS);

			switch (newAnimal) {

			case 1:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.TIGER);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs\n",
						animal[i].getNrOfLegs());
				break;

			case 2:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.MONKEY);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 3:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.COW);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 4:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.LIZZARD);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 5:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.KOMODODRAGON);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 6:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.SNAKE);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 7:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.VULTURE);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 8:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.SWAN);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 9:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.OWL);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 10:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.SHARK);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 11:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.OCTOPUS);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 12:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.FISH);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 13:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.BUTTERFLY);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 14:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.COCKROACH);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			case 15:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.SPIDER);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			}
		}

		/*
		 * Zoowsome second part
		 */

		CaretakerFactory caretakerFactory = new CaretakerFactory();
		Employee[] caretaker = new Caretaker[Constants.NR_OF_CARETAKERS];

		for (int i = 1; i <= Constants.NR_OF_CARETAKERS; i++) {
			caretaker[i] = caretakerFactory.getEmployeeFactory(Constants.Employees.Caretakers.CARETAKER);
		}

		String result;
		for (int i = 1; i <= Constants.NR_OF_CARETAKERS; i++) {
			for (int j = 1; j <= Constants.NR_OF_ANIMALS; j++) {
				if ((caretaker[i].getIsDead() == false) && (animal[j].getTakenCareOf() == false)) {
					result = ((Caretaker) caretaker[i]).takeCareOf(animal[j]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretaker[i].setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						animal[j].setTakenCareOf(true);
					}
				}
			}
		}

		System.out.println(
				"***************************************************************************************************************");
		for (int i = 1; i <= Constants.NR_OF_ANIMALS; i++) {
			if (animal[i].getTakenCareOf() == true) {
				System.out.println(animal[i].getName() + "has been taken care of");
			} else {
				System.out.println(animal[i].getName() + " hasn't been taken care of");
			}
		}

	}
}
