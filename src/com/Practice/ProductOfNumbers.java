package com.Practice;
import java.util.*;
public class ProductOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int pro=1;
		for(int i=1;i<=num;i++) {
			pro*=i;
			
		}
		System.out.println(pro);

	}

}
