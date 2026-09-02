package com.oop.animla_project;
import java.util.*;
public class AnimalUtility {
	static Scanner sc=new Scanner(System.in);
	public static Animal createAnimal() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Animal Name you want to create:");
		while(true) {
			System.out.println("Lion, Tiger, Kangaroo");
            String animal = sc.nextLine();

            if (animal.equalsIgnoreCase("Lion")) {
                return createLion();

            } else if (animal.equalsIgnoreCase("Tiger")) {
                return createTiger();

            } else if (animal.equalsIgnoreCase("Kangaroo")) {
                return createKangaroo();

            } else {
                System.out.println("Entered wrong animal name");
				}
            }
		}
	private static Kangaroo createKangaroo() {
		 System.out.println("Enter Kangaroo name: ");
	        String name = sc.nextLine();
	        System.out.println("Enter gender: ");
	        String gender = sc.nextLine();
	        System.out.println("Enter kills: ");
	        int kills = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter the habitat: ");
	        String habitat=sc.nextLine();
	        System.out.println("Enter the Kangaroo jump height: ");
	        Double height=sc.nextDouble();
	        sc.nextLine();

	        return new Kangaroo(name, gender, kills, habitat, height);
	}
	private static Tiger createTiger() {
		 System.out.println("Enter Tiger name: ");
	        String name = sc.nextLine();
	        System.out.println("Enter gender: ");
	        String gender = sc.nextLine();
	        System.out.println("Enter kills: ");
	        int kills = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter Tiger Species: ");
	        String species = sc.nextLine();
	        System.out.println("Enter the tiger speed: ");
	        Double speed=sc.nextDouble();
	        sc.nextLine();

	        return new Tiger(name, gender, kills, species, speed);
	}
	private static Lion createLion(){
		  System.out.println("Enter Lion name: ");
	        String name = sc.nextLine();
	        System.out.println("Enter gender: ");
	        String gender = sc.next();
	        System.out.println("Enter kills: ");
	        int kills = sc.nextInt();
	        System.out.println("Enter the age: ");
	        int age=sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter the wight: ");
	        Double weight = sc.nextDouble();
	        sc.nextLine();
	        return new Lion(name, gender, kills, age, weight);
	}

}
