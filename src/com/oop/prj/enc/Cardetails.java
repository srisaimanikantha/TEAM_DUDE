package com.oop.prj.enc;
class Car{
	private String name;
	private String modern;
	private double milage;
	private String brand;
	public Car() {
		System.out.println("Enter The Car Name");
		System.out.println("Set the modern");
		System.out.println("Set the Milage");
		System.out.println("Describe your brand car");
		
		System.out.println("============================");
		
	}
	public Car(String name, String modern, double milage, String brand) {
		super();
		this.name = name;
		this.modern = modern;
		this.milage = milage;
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModern() {
		return modern;
	}
	public void setModern(String modern) {
		this.modern = modern;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void cardetails() {
		System.out.println(name);
		System.out.println(modern);
		System.out.println(milage);
		System.out.println(brand);
	}
}

public class Cardetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.setName("BMW Motors");
		c1.setModern("BMW");
		c1.setMilage(18.9);
		c1.setBrand("BMW");
		c1.cardetails();

	}

}
