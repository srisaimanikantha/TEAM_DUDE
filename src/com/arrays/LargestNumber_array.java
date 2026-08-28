package com.arrays;

public class LargestNumber_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,56,2,78,9,32};
		int lar=arr[0];
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			if(arr[i]>lar) {
				lar=arr[i];
			}
			
		}
		System.out.println(lar);
	}

}
