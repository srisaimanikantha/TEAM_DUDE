package com.Practice;
import java.util.*;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible Vote");
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
