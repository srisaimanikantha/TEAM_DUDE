package com.Patterns;
import java.util.*;

public class Passcals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
//		for(int i=n-1;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		int star=0;
		for(int i=1;i<=n;i++) {
			if(i<=3)
				star++;
			else
				star--;
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
