package com.oop.Project2;

public class CarController {
	static CarRepository carrepo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarEntity c1=new CarEntity();
		
		c1.setName("BMW");
		c1.setMilage(50);
		c1.setBrand("Manikanta");
		
		
		CarEntity c2=new CarEntity();
		
		c2.setName("Hemanth");
		c2.setBrand("Manikanta");
		c2.setMilage(570);
		
		
		carrepo =new CarRepository();
		
		carrepo.saveCar(c1);
		
		carrepo.saveCar(c2);
		
		
	}

}
