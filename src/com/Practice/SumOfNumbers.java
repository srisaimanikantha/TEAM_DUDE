package com.Practice;
import java.util.*;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
