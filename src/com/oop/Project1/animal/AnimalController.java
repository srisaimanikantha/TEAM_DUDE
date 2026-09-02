package com.oop.Project1.animal;

public class AnimalController {
	
	static AnimalRepository animalRepo;
	
	public static void main(String[] args) {
		
		LionEntity l1=new LionEntity();
		
		l1.setName("Mani Kanta");
		l1.setGender("Male");
		l1.setKils(203);
		
	
	
		LionEntity l2=new LionEntity();
		l2.setName("Hemanth");
		l2.setGender("Male");
		l2.setKils(78);
		
		
		
		
		animalRepo =new AnimalRepository();
		
		animalRepo.saveAnimal(l1);
		
		animalRepo.saveAnimal(l2);
		
		
		
	}
}
