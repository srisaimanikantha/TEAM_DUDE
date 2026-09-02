package com.demo.practice;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	

}
