package com.demo.practice;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int even_sum=0;
		int odd_sum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even_sum++;
			}else {
				odd_sum++;
			}
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);
		

	}

}
