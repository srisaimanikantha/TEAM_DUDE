package com.oop.animla_project;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {

	    List<Animal> animals = new ArrayList<>();

	    public void saveAnimal(Animal animal) {
	        animals.add(animal);
	        System.out.println("Animal Saved Successfully");
	    }

	    public void getAllAnimals() {
	        for (Animal animal : animals) {
	            animal.animalDetails();
	            System.out.println();
	        }
	    }

	    public Animal getAnimal(String name) {
	        for (Animal animal : animals) {
	            if (animal.getName().equalsIgnoreCase(name)) {
	                return animal;
	            }
	        }
	        return null;
	    }
		
	}

