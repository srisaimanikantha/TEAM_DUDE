package com.basicifelse;
import java.util.*;

public class LateToWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		boolean isRaining=sc.nextBoolean();
		boolean isMonday=sc.nextBoolean();
		if(min>0 && min<=5) {
			System.out.println("You are early! ");
		}
		else if(min>5 && min<15) {
			System.out.println("Traffic!");
		}
		else if(min>16 && min<30 && isRaining) {
			System.out.println("Valid excuse ! Rain is evil");
		}
		else if(min>16 && min<30 && !isRaining) {
			System.out.println("No excuse!");
		}
		else if(min>31) {
			System.out.println("Did you even wake up?");
		}
		else {
			System.out.println("Negative minutes");
		}
		

	}

}
