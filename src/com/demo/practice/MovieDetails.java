package com.demo.practice;

import java.util.Scanner;

class Movie{
	String name;
	String lang;
	double rating;
	public Movie(String name) {
		super();
		this.name = name;
	}
	public Movie(String name, String lang) {
		super();
		this.name = name;
		this.lang = lang;
	}
	public Movie(String name, String lang, double rating) {
		super();
		this.name = name;
		this.lang = lang;
		this.rating = rating;
	}
	void display() {
		System.out.println("Movie: " +this.name);
		if(lang!=null) {
			System.out.println("Language: "+this.lang);
			
		}
		if(rating>0.0) {
			System.out.println("Rating: "+this.rating);
		}
		System.out.println();
	}
	
	
}

public class MovieDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter movie name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter language: ");
		String lang=sc.nextLine();
		
		System.out.print("Enter rating: ");
		double rating =sc.nextDouble();
		
		Movie m=new Movie(name);
		Movie m1=new Movie(name, lang);
		Movie m2=new Movie(name, lang, rating);
		
		m.display();
		m1.display();
		m2.display();
		

	}

}
