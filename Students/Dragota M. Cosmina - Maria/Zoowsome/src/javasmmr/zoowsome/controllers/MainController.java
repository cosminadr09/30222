package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.*;

public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		Animal[] animal = new Animal[Constants.Animals.NO_OF_ANIMALS];
		SpeciesFactory speciesFactory1 = abstractFactory
				.getSpeciesFactory(Constants.Species.MAMMALS);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.MONKEY);
		System.out.println("We have a " + a1.getName());
		Animal a2 = speciesFactory1.getAnimal(Constants.Animals.Mammals.TIGER);
		System.out.println("We have a " + a2.getName());
		Animal a3 = speciesFactory1.getAnimal(Constants.Animals.Mammals.HORSE);
		System.out.println("We have a " + a3.getName());

		SpeciesFactory speciesFactory2 = abstractFactory
				.getSpeciesFactory(Constants.Species.REPTILES);
		Animal a4 = speciesFactory2
				.getAnimal(Constants.Animals.Reptiles.CROCODILE);
		System.out.println("We have a " + a4.getName());
		Animal a5 = speciesFactory2.getAnimal(Constants.Animals.Reptiles.SNAKE);
		System.out.println("We have a " + a5.getName());
		Animal a6 = speciesFactory2
				.getAnimal(Constants.Animals.Reptiles.LIZARD);
		System.out.println("We have a " + a6.getName());

		SpeciesFactory speciesFactory3 = abstractFactory
				.getSpeciesFactory(Constants.Species.BIRDS);
		Animal a7 = speciesFactory3.getAnimal(Constants.Animals.Birds.SWALLOW);
		System.out.println("We have a " + a7.getName());
		Animal a8 = speciesFactory3.getAnimal(Constants.Animals.Birds.DOVE);
		System.out.println("We have a " + a8.getName());
		Animal a9 = speciesFactory3.getAnimal(Constants.Animals.Birds.EAGLE);
		System.out.println("We have a " + a9.getName());

		SpeciesFactory speciesFactory4 = abstractFactory
				.getSpeciesFactory(Constants.Species.INSECTS);
		Animal a10 = speciesFactory4
				.getAnimal(Constants.Animals.Insects.BUTTERFLY);
		System.out.println("We have a " + a10.getName());
		Animal a11 = speciesFactory4
				.getAnimal(Constants.Animals.Insects.CRICKET);
		System.out.println("We have a " + a11.getName());
		Animal a12 = speciesFactory4
				.getAnimal(Constants.Animals.Insects.SPIDER);
		System.out.println("We have a " + a12.getName());

		SpeciesFactory speciesFactory5 = abstractFactory
				.getSpeciesFactory(Constants.Species.AQUATICS);
		Animal a13 = speciesFactory5
				.getAnimal(Constants.Animals.Aquatics.DOLPHIN);
		System.out.println("We have a " + a13.getName());
		Animal a14 = speciesFactory5
				.getAnimal(Constants.Animals.Aquatics.SALMON);
		System.out.println("We have a " + a14.getName());
		Animal a15 = speciesFactory5
				.getAnimal(Constants.Animals.Aquatics.WHALE);
		System.out.println("We have a " + a15.getName());

		// in the MainController create a few Caretakers
		// and iterate through all the animals and try to take care of them all.
		CaretakerFactory caretakerFactory = new CaretakerFactory();
		caretakerFactory.getEmployee(Constants.Employees.Caretakers.CARETAKER);
		Caretaker[] caretaker = new Caretaker[Constants.Employees.Caretakers.NO_OF_CARETAKERS];

		for (int i = 0; i < Constants.Employees.Caretakers.NO_OF_CARETAKERS; i++) {
			for (int j = 0; j < Constants.Animals.NO_OF_ANIMALS; j++) {
				if (!(caretaker[i].getIsDead()) && !(animal[j].getTakenCareOf())) {
					String result = caretaker[i].takeCareOf(animal[j]);
					if (result
							.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretaker[i].setIsDead(true);
					} else if (result
							.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						animal[j].setTakenCareOf(true);
					}
				}
			}
		}

		for (int i = 0; i < Constants.Animals.NO_OF_ANIMALS; i++) {
			System.out.println(animal[i].getName() + "is taken care of:"
					+ animal[i].getTakenCareOf());
		}

	}
}