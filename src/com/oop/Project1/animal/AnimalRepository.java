package com.oop.Project1.animal;

public class AnimalRepository {

	public void saveAnimal(LionEntity l1) {
	
		System.out.println("Animal Home");
		System.out.println(l1.getName());
		System.out.println("============");
		l1.animalDetails();
		System.out.println("Animal Saved");
		System.out.println("===========");
		
	}

}
