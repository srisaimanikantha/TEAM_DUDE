package com.demo.practice;
import java.util.Scanner;
public class Right_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int star=0;
		for(int i=1;i<=n;i++) {
			star++;
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
