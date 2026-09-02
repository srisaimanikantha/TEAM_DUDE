package com.oop.Project1.animal;

public class LionEntity {
	
	private static int legs=4;
	private String name;
	private String gender;
	private int kils;
	
	public LionEntity() {
		
	}

	public LionEntity(String name, String gender, int kils) {
		super();
		this.name = name;
		this.gender = gender;
		this.kils = kils;
	}

	public static int getLegs() {
		return legs;
	}

	public static void setLegs(int legs) {
		LionEntity.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getKils() {
		return kils;
	}

	public void setKils(int kils) {
		this.kils = kils;
	}
	public void animalDetails() {
		
		System.out.println("Name:"+this.name);;
		System.out.println("Gender:"+this.gender);
		System.out.println("Kills: "+this.kils);
		System.out.println("legs:"+this.legs);

	}

	
}
