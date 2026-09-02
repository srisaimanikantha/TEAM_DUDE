package com.Patterns;
import java.util.*;

public class Number_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"");
//			}
//			System.out.println(" ");
//		}
		
//		for(int i=1;i<=n;i++) {
//			for(int j=0;j<=n;j++) {
//				if(i%2!=0) { 
//					System.out.print(j+" ");
//				}
//				else {
//					System.out.print(j+n+1+" ");
//				}
//			}
//			System.out.println();
//			
//		}
		// 0 1 2 3 4
		// 5 6 7 8 9
		// 0 1 2 3 4
		// 5 6 7 8 9 
//		for(int i=1;i<=n;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print((i+j)%2+" ");
//			}
//			System.out.println();
//		}
//		1 
//		0 1 
//		1 0 1 
//		0 1 0 1 
//		1 0 1 0 1 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
	}
	}
}




