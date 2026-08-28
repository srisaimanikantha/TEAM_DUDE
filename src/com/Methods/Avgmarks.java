package com.Methods;
import java.util.*;

public class Avgmarks {
	static void total(int a, int b, int c) {
		int tot= a+b+c ;
		double avg= tot /3.0;
		
		System.out.println("Total Marks :"+tot);
		System.out.println("Average Marks: "+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of Subject 1:");
		int a=sc.nextInt();
		System.out.println("Enter marks of subject 2:");
		int b=sc.nextInt();
		System.out.println("Enter marks of subject 3:");
		int c=sc.nextInt();
		
		total(a,b,c);
		
		

	}

}
