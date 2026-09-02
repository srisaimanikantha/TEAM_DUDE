package com.oops.interface_exmp1;

 interface  Vehicle{
	 void start();
	 void stop();
	 
 }
 class Car implements Vehicle{
	  @Override
	public void start() {
		// TODO Auto-generated method stub
		  System.out.println("Car is start");
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car is stop");
		
	}
	void taxi() {
		System.out.println("Car is acts as taxi to drop 4 members");
	}
	 
 }
 class BMW extends Car{
	 @Override
	void taxi() {
		// TODO Auto-generated method stub
		System.out.println("BMW is a personal taxi");
	}
	 void drive() {
		 System.out.println("Going to drive");
	 }
 }
 class Bike implements Vehicle{
	 @Override
	public void start() {
		// TODO Auto-generated method stub
		 System.out.println("Bike is a Started by Mani ");
		
	}
	 @Override
	public void stop() {
		// TODO Auto-generated method stub
		 System.out.println("Bike was stoped By hemanth ");
		
	}
 }

public class UseVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Car();
		//vehicle=new BMW();
		displayVehicle(vehicle);
		vehicle=new BMW();
		displayVehicle(vehicle);
		vehicle=new Bike();
		displayVehicle(vehicle);
		

	}
	private static void displayVehicle(Vehicle vehicle) {
		if(vehicle instanceof Car) {
			Car car=(Car) vehicle;
			car.stop();
			car.start();
			car.taxi();
		}
		else if(vehicle instanceof BMW) {
			BMW bmw=(BMW) vehicle;
			bmw.start();
			bmw.stop();
			bmw.taxi();
			bmw.drive();
		}
		else //if(vehicle instanceof Bike)
			{
			Bike b=(Bike) vehicle;
			b.stop();
			b.start();
			
		}
	}
	

}
