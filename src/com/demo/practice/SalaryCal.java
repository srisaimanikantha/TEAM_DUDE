package com.demo.practice;

import java.util.Scanner;

class Salary{
	void cal(int salary) {
		System.out.println("Basic Salary: " + salary);
		
	}
	void cal(int salary, int b) {
		System.out.println("Salary with Bonus: " + (salary + b));
		
	}
	void cal(int salary,int b, int allow) {
		System.out.println("Total Salary: " + (salary+b+allow));
		
	}
}

public class SalaryCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basic salary:");
		int salary=sc.nextInt();
		System.out.print("Enter bonus:");
		int b=sc.nextInt();
		System.out.print("Enter allowance:");
		int allow=sc.nextInt();
		Salary s=new Salary();
		s.cal(salary);
		s.cal(salary, b);
		s.cal(salary, b, allow);
		

	}

}
