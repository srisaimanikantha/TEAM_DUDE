package com.basicifelse;
import java.util.*;
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("1.Dose 2.Idli 3.Puri");
		switch(choice){
		case 1:
			System.out.println("Dosa");
			break;
		case 2:
			System.out.println("Idli");
			break;
		case 3:
			System.out.println("Puri");
			break;
		default:
			System.out.println("Upma");
		}

	}

}
