package com.Static;

public class company {
	static String name="Meta";
	static int code=012;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CloudServices();
		Services();
		System.out.println(name);
		System.out.println(code);

	}


	 static void CloudServices() {
		// TODO Auto-generated method stub
		System.out.println("Cloud Services");
	}                                                   ////non static


	 static void Services() {
		// TODO Auto-generated method stub
		System.out.println("SAAS Products");
		System.out.println("Online ticket for resolving");
		
	}

}
