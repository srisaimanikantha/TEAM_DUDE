package com.basic;

public class FamilyMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		familyMem("Siva","Chenchi Reddy","Nageswaramma","Madhavi","Shirish");
		System.out.println("========================");
		Laptop("Traditional Laptop","Ultra Laptop","Gaming Laptop","Bussiness Laptop");
		

	}

	private static void Laptop(String design,String Longlife, String Gaming, String office ) {
		// TODO Auto-generated method stub
		System.out.println("Design laptop->"+design+" |"+"longLifeLaptop->"+Longlife+"|"+"Gaming Laptop->"+Gaming+"|"+"Office Laptop->"+office);
		
	}

	private static void familyMem(String name,String FatherName,String MotherName,String SisName,String sisName) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+name+" "+"Father Name:"+FatherName+" "+"Mother Name:"+MotherName+" "+"Sister Name:"+SisName+" "+"Sister Name:"+sisName);
	}

}
