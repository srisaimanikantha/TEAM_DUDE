package com.constructor;

import java.util.Scanner;

class Mobile{
	String brandname;
	String modelname;
	int storagecap;
	public Mobile(String brandname, String modelname, int storagecap) {
		super();
		this.brandname = brandname;
		this.modelname = modelname;
		this.storagecap = storagecap;
	}
	
	public void details() {
		System.out.println("Mobile details");
		System.out.println("Brand: "+this.brandname);
		System.out.println("Model: "+this.modelname);
		System.out.println("Storage: "+this.storagecap+" GB");
	}
	
}

public class MobileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Brand name:");
		String brand=sc.nextLine();
		System.out.println("Enter the model name: ");
		String model=sc.nextLine();
		System.out.println("Enter the storage Capacity:");
		int storage=sc.nextInt();		
		Mobile m=new Mobile(brand,model,storage);
		m.details();

	}

}
