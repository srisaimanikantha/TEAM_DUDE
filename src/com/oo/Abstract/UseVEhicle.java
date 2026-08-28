package com.oo.Abstract;

abstract class Vehicle{
	abstract void start();
	abstract void details();
}
class Car extends Vehicle{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Car is a Vehicle");
		
	}

	@Override
	void details() {
		// TODO Auto-generated method stub
		System.out.println("Car has 4 wheels");
		
	}
	
}
class Bike extends Vehicle{

	@Override
	void start() {
		System.out.println("Bike is a Vehicle");
		
	}

	@Override
	void details() {
		System.err.println("Bike has 2 wheels");
	
		
	}
	
}
public class UseVEhicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Car c1=new Car();
		Bike b1=new Bike();
		saveVehicl(c1);
		saveVehicl(b1);
	}

	private static void saveVehicl(Vehicle v) {
		// TODO Auto-generated method stub
		v.start();
		v.details();
		
	}

}
