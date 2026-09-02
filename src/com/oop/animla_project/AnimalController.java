package com.oop.animla_project;
import java.util.*;

//  Presentation Layer //

public class AnimalController {
	
	static AnimalRepository animalrepo=new AnimalRepository();

	public static void main(String[] args) {
		
		// show options to user continuously
		// inside loop (options 1,2,3,4)
		Scanner sc=new Scanner(System.in);
		boolean condition=true;
		while(condition) {
			System.out.println("1.Save 2.Get All 3. Get Animal 4.Exit");
			System.out.println("enter the choice");
			
			int choice=sc.nextInt();
			
			sc.nextLine();
			switch(choice) {
			
			case 1 : AnimalController.saveAnimal();
			         break;
			case 2 : AnimalController.getAllAnimals();
			         break;
			case 3 :AnimalController.getAnimal();
			         break;
			case 4 : System.out.println("App is Exit");
			         condition=false;
			         break;
			default: System.out.println("Invalid Choioce");
			
			}
		}
	
	}
	
	private static void saveAnimal() {
		System.out.println("All Animals are save");
		Animal animal=AnimalUtility.createAnimal();
		
		// Saving animal Object to Repo
		AnimalController.animalrepo.saveAnimal(animal); /// create utility class in this class all are static methods
	

	}
	private static void getAllAnimals() {
		//Animal animal=AnimalUtility.createAnimal();
		System.out.println("All animals are retrive");
	//	AnimalController.animalrepo.saveAnimal(animal);
	

	}
	private static void getAnimal() {
		System.out.println("Get AAnimal Name");

	}

}
