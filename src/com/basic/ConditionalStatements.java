package com.basic;

import java.util.Scanner;

public class ConditionalStatements {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifBlockExamples();
		System.out.println("=======================");
		
		ifElseExamples();
		System.out.println("==============");
		ScannerConditions();
		

	}

	private static void ScannerConditions() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int age=20;
		if(age>18) {
			System.out.println("eligible to vote");
		}
		else {
			System.out.println("Not eligible");
		}
		
	}

	private static void ifElseExamples() {
		// TODO Auto-generated method stub
		int age=32;
		if(age>21 && age<=35) {
			System.out.println("Eligible for marraige");
		}
		else {
			System.out.println("Not Eligible for marraige");
		}
	}

	private static void ifBlockExamples() {
		// TODO Auto-generated method stub
		int money=2000;
		if(money>=300) {
			System.out.println("Enjoy Show");
		}
	}

}
