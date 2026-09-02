package com.demo.practice;

import java.util.Scanner;

class Time{
	void showtime(int hr) {
		System.out.println("Time: " + hr);
	}
	void showtime(int hr,int min) {
		System.out.println("Time: " + hr + ":" +min);
	}
	void showtime(int hr,int min,int sec) {
		System.out.println("Time: " + hr + ":" +min + ":" +sec);
	}
}

public class TimeDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter hours: ");
		int hr=sc.nextInt();
		System.out.print("Enter minutes: ");
		int min=sc.nextInt();
		System.out.print("Enter seconds: ");
		int sec=sc.nextInt();
		
		Time t=new Time();
		t.showtime(hr);
		t.showtime(hr, min);
		t.showtime(hr, min, sec);
		

	}

}
