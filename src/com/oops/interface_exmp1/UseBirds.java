package com.oops.interface_exmp1;

interface Fly{
	void fly();
}

interface Swim{
	void swim();
}

interface Run{
	void run();	
}

class Eagle implements Fly{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
	System.out.println("Eagle flies above the Sky:");	
	}
}

class Duck implements Fly,Swim,Run{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Duck runs when it's in danger or to meet someone");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Duck swims as a routine");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Duck flies for short distance");
		
	}
	
}
class Hen implements Fly,Run{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hens run when it panics");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Hens flies away from danger or to hunt");
		
	}
	
}


public class UseBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		chooseYourBird("Hen");
		System.out.println("===============");
		chooseYourBird("Duck");
		System.out.println("=================");
		chooseYourBird("Eagle");
		

	}

	private static void chooseYourBird(String bird) {
		// TODO Auto-generated method stub
		if(bird.equalsIgnoreCase("Hen")) {
			Hen h=new Hen();
			h.fly();
			h.run();
		}else if(bird.equalsIgnoreCase("Eagle")) {
			Eagle e=new Eagle();
			e.fly();
		
		}else if(bird.equalsIgnoreCase("Duck")) {
			Duck d=new Duck();
			d.fly();
			d.run();
			d.swim();
		}
		
		
	}

}
