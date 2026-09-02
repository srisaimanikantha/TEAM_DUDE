package com.demo.practice;
import java.util.*;

public class ArrayLar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int[] arr=new int[n];
		int max=arr[0];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		if(arr[i]>max) {
			max=arr[i];
		}
		}
	System.out.println(max);
	}
}
