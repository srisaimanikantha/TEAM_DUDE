package com.Practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int rev=0;
		int n=num;
		while(num!=0) {
			int temp=num%10;
			rev=rev*10+temp;
			num/=10;
		}
		if(rev==n) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
