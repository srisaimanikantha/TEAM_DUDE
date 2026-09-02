package com.basicifelse;
import java.util.*;
public class MarriageEligibilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<=21) {
			System.out.println("Have Some Patience");
		}
		else if(age>=22 && age<35) {
			System.out.println("Eligible for Marriage");
		}
		else {
			System.out.println("You have lot Of Patience");
		}
	}

}
