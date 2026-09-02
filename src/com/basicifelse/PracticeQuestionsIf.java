package com.basicifelse;

public class PracticeQuestionsIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifcondition();
		System.out.println("=============");
		FitnessJourney();
		System.out.println("===============");
		ShoppinSpree();

	}

	private static void ShoppinSpree() {
		// TODO Auto-generated method stub
		int cart=3;
		int wal=10;
		boolean hasDiscount=false;
		if(cart>5 && wal>20 || hasDiscount) {
			System.out.println("shopping Spree");
		}
		else {
			System.out.println("broke");
		}
		
	}

	private static void FitnessJourney() {
		// TODO Auto-generated method stub
		int gym=1;
		double weight=0.2;
		boolean isMonday=true;
		if(gym>=3 && weight >=0.5) {
			System.out.println("fitnessgood");
		}else {
			System.out.println("excuse");
			
		}
		
	}

	private static void ifcondition() {
		// TODO Auto-generated method stub
		int bug=25;
		int coffee=3;
		boolean isFriday=true;
		if(bug>20 || coffee <=2 && !isFriday) {
			System.out.println("panic");	
			}
		else {
			System.out.println("genius");
		}
		
	}

}
