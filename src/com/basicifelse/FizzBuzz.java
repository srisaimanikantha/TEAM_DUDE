package com.basicifelse;
import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%3==0 && num%4==0) {
			System.out.println("FizzBuzz");
		}
		else if(num%3==0) {
			System.out.println("Fizz");
		}
		else if(num%4==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println("No FizzBuzz");
		}
		

	}

}
