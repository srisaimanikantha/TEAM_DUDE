package com.oop.prj.enc;

class Flower{
	private String name;
	private int no_of_petals;
	public String setName; 
	public Flower() {
		
		System.out.println("Set the name");
		System.out.println("Set the no of petals");
	}
	
	public Flower(String name, int no_of_petals) {
		super();
		this.name = name;
		this.no_of_petals = no_of_petals;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_of_petals() {
		return no_of_petals;
	}
	public void setNo_of_petals(int no_of_petals) {
		this.no_of_petals = no_of_petals;
	}
	public void greet(String Purpose){
		System.out.println("Name: "+name);
		System.out.println("No of petals: "+no_of_petals);
		
	}
}



public class UseFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f1=new Flower();
		f1.setName("Jasmine");
		f1.setNo_of_petals(6);
		
		f1.greet("Alankar");
		System.out.println("==========================");
		
		Flower f2=new Flower();
		f2.setName("Rose");
		f2.setNo_of_petals(26);
		
		f2.greet("to make someone special");
		
		System.out.println("==============");
		
		Flower f3=new Flower();
		f3.setName("Marry gold");
		f3.setNo_of_petals(71);
		
		f3.greet("pooja");
		System.out.println("======================");
		
		Flower[] allFlowers= {f1,f2,f3};
			
		System.out.println("====== Print names of all Flowers");
		for(Flower Value:allFlowers) {
			System.out.println("Flower name: "+Value.getName());
		}

	}

}
