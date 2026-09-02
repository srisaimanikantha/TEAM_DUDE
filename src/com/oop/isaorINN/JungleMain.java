package com.oop.isaorINN;

class Animal{
	String name;
	String habitat;
	public Animal(String name, String habitat) {
		super();
		this.name = name;
		this.habitat = habitat;
	}
	public void makeSound(){
		System.out.println(this.getClass().getName());
		System.out.println("Name: "+this.name+"->habitat"+this.habitat);
	}
}
class Buffalo extends Animal{
	int legs;

	public Buffalo(String name, String habitat, int legs) {
		super(name, habitat);
		this.legs = legs;
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
		System.out.println("Buffalo makes Sound Jada.......... jadaaa......");
	}
	
}


public class JungleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffalo b1=new Buffalo("hema","mani farm",4);
		b1.makeSound();
		

	}

}
