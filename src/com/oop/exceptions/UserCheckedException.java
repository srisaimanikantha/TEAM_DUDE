package com.oop.exceptions;

class InsufficientFundsException extends Exception{
	
}

class Bank{
	double balance;
	Bank(double balance){
		this.balance=balance;
	}
	void withdraw(double amount) {
		this.balance=this.balance-amount;
	}
}
public class UserCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(200.0);
		b.withdraw(1000);
		
		System.out.println(" Withdrawn is successfull");
		System.out.println("Your remaining balance ");
		System.out.println(b.balance);

	}

}
