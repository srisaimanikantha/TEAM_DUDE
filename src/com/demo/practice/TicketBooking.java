package com.demo.practice;

import java.util.Scanner;

class Ticket{
	String name;
	String setnum;
	int price;
	public Ticket(String name) {
		this.name = name;
	}
	public Ticket(String name, String setnum) {
		this.name = name;
		this.setnum = setnum;
	}
	public Ticket(String name, String setnum, int price) {
		this.name = name;
		this.setnum = setnum;
		this.price = price;
	}
	
	void display() {
		System.out.println("Passenger: "+this.name);
		if(setnum !=null) {
		System.out.println("Seat: "+this.setnum);
		}
		if(price>0) {
		System.out.println("Ticket: "+this.price);
		}
		System.out.println();
	}
	
	
}

public class TicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Passenger: ");
		String name=sc.nextLine();
		
		System.out.print("Enter Seat Number: ");
		String setnum=sc.nextLine();
		
		System.out.print("Enter seat numeber: ");
		int price=sc.nextInt();
		
		Ticket t=new Ticket(name);
		Ticket t1=new Ticket(name, setnum);
		Ticket t2=new Ticket(name, setnum, price);
		
		t.display();
		t1.display();
		t2.display();
		
		

	}

}
