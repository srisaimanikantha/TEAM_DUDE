package com.basic;

public class BioData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BD("siva",22,"sivasan@gmail.com","Plvd","AP");
		BD("Mani",23,"mani@gmail.com","Vizag","AP");
		BD("Hemanth",21,"hemanth@gmail.com","Vijayawada","Andhra Pradesh");

	}

	private static void BD(String name,int age,String email,String city,String state) {
		// TODO Auto-generated method stub
		System.out.println("name:" + name + " "+"age:" +age  +" "+ "email:" +email +" "+ "city:" +city +" "+ "state:" +state);
		System.out.println("========");
		
	}

}
