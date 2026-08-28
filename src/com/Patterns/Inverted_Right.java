package com.Patterns;
import java.util.*;

public class Inverted_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=n-1;j++) {
//				System.out.print(" ");
//			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
