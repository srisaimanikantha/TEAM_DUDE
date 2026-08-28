package com.Patterns;
import java.util.*;
public class Traingle_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>=1;k--) {
				System.out.print('*'+" ");
			}
			System.out.println();
		}

	}

}
