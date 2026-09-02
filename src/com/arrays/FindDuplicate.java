package com.arrays;
import java.util.*;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr= {1,2,3,4,1,5,};
//		for(int i=0;i<arr.length;i++) {
//			int tar=arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				if(tar==arr[j]) {
//					System.out.println(arr[j]);
//				}
//			}
//		}
//		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Number of array:"+arr[i]);
				}
				
			}
		}

	}

}
