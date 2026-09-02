package com.Practice;
import java.util.*;
public class VowCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("It is a Vowel");
		}
		else {
			System.out.println("Consonant");
			
		}
		
		

	}

}
