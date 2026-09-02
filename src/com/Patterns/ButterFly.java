package com.Patterns;
import java.util.*;

public class ButterFly {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int star=0;
			int space=2*n-1;
			for(int i=1;i<=2*n-1;i++) {
				if(i<=n) {
					star++;
					space-=2;
				}else {
					star--;
					space+=2;
				}
				for(int j=1;j<=star;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=space;j++) {
					System.out.print(" ");
				}
				for(int j=1 ;j<=star;j++) {
					if(i==n&&j==star) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			sc.close();

	}
	}