package com.oop.Project2;

public class CarEntity {
	private static int wheels =4;
	private String name;
	private int milage;
	private String brand;
	
	
	public CarEntity() {
		
	}
	
	public CarEntity(String name, int milage, String brand) {
		super();
		this.name = name;
		this.milage = milage;
		this.brand = brand;
	}
	public static int getWheels() {
		return wheels;
	}
	public static void setWheels(int wheels) {
		CarEntity.wheels = wheels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void Cardetails() {
		System.out.println("Name:"+this.name);
		System.out.println("Milage:"+this.milage);
		System.out.println("Brand: "+this.brand);
		System.out.println("Wheels: "+this.wheels);
	}
	
	
	
	
}
