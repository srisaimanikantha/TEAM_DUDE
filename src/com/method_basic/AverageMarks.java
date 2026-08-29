package com.method_basic;
import java.util.*;

class Marks{
	void calculate(int marks1, int marks2, int marks3) {
		int total = marks1+marks2+marks3;
		double avg=total/3.0;
		System.out.println("Total Marks: "+total);
		System.out.println("Average Marks: "+avg);
	}
}
public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entet marks of Subject 1: ");
		int marks1=sc.nextInt();
		System.out.println("Enter marks of Subject 2: ");
		int marks2=sc.nextInt();
		System.out.println("Enter marks of subject 3: ");
		int marks3 = sc.nextInt();
		Marks m = new Marks();
		m.calculate(marks1, marks2, marks3);
		sc.close();
		// TODO Auto-generated method stub

	}

}
