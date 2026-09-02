package com.oops.interface_exmp1;

interface AnimalBehaiour{
	void eat();
	void sleep();
}
class Lion implements AnimalBehaiour{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lion eats Metts");
		
	}
	@Override
	public void sleep() {
		System.out.println("Lion sleeps after eating");
		
	}
	void hunt() {
		System.out.println("Lion hunts deer");
	}
	
}
class Deer implements AnimalBehaiour{
	@Override
	public void eat() {
		System.out.println("Deer eat grass");
		
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Deer always sleep when it his free");	
		
	}
	void flee() {
		System.out.println("Deer always feel from danger");
		
	}
	
}

public class AnimalBehaviour {
	public static void main(String[] args) {
	AnimalBehaiour animalBehaiour=new Lion();
	animalBehaiour=new Deer();
	displayAnimalBehaiour(animalBehaiour);

}
private static void displayAnimalBehaiour(AnimalBehaiour animalBehaiour) {
	if(animalBehaiour instanceof Lion) {
		Lion l=(Lion)animalBehaiour;
		l.eat();
		l.sleep();
		l.hunt();
		
	}
	else if(animalBehaiour instanceof Deer) {
		Deer d=(Deer)animalBehaiour;
		d.eat();
		d.sleep();
		d.flee();
	}

}
}
