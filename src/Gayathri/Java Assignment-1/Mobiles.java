package com.demo.practice;
import java.util.Scanner;
class Mobile{
	String brand;
	String model;
	int storage;
	public Mobile(String brand,String model,int storage) {
		this.brand=brand;
		this.model=model;
		this.storage=storage;
	}
	public void displayDetails(){
		System.out.println("mobile details:");
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("storage:"+storage+"GB");
	}
}

public class Mobiles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter brand:");
		String brand=sc.nextLine();
		System.out.println("enter model:");
		String model=sc.nextLine();
		System.out.println("enter storage");
		int storage=sc.nextInt();
		Mobile myMobile=new Mobile(brand,model,storage);
		myMobile.displayDetails();
		sc.close();

	}

}
