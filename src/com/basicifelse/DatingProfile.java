package com.basicifelse;
import java.util.*;
public class DatingProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		boolean hasJob=sc.nextBoolean();
		boolean likesPineappleOnPizza=sc.nextBoolean();
		if(age>=25 && age<=35 && hasJob && likesPineappleOnPizza) {
			System.out.println("Match! do not Found! ");
		}
		else if(age>=25 && age<=35 && hasJob&& !likesPineappleOnPizza) {
			System.out.println("We caan work On it..");
			
		}
		else if(age>=25 && age<=35 && !hasJob&& !likesPineappleOnPizza) {
			System.out.println("Absolutely not.Bye");
		}
		else if(age<=35 && hasJob && likesPineappleOnPizza) {
			System.out.println("You're to old/young..");
		}
		else {
			System.out.println("Are you even human?");
		}	
		

	}

}
