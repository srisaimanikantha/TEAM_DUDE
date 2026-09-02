package com.oops.interface_exmp1;

interface Bank{
	void deposite();
	void withdraw();
	void display();
}
class BankHelper{
	private static class SBI  implements Bank{
		@Override
		public void deposite() {
			System.out.println("SBI branch Money is deposite");
			// TODO Auto-generated method stub	
		}
		@Override
		public void withdraw() {
			System.out.println("SBI branch Money is Withdraw");
			// TODO Auto-generated method stub
		}
		public void display() {
			System.out.println("SBI Lone Close");
		}
		
	}
	private static class HDFC implements Bank{
		@Override
		public void deposite() {
			System.out.println("HDFC branch money is deposite");
			// TODO Auto-generated method stub	
		}
		@Override
		public void withdraw() {
			System.out.println("HDFC branch money is withdraw");
			// TODO Auto-generated method stub	
		}
		public void display() {
			System.out.println("HDFC Lone Close");
		}	
	}
	public static Bank getBank(String bankName) {
        if (bankName.equalsIgnoreCase("SBI")) {
            return new SBI();
        }
        if (bankName.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        }
        return null;
    }
}
public class UserBank {
	public static void main(String[] args) {
		Bank bank=BankHelper.getBank("SBI");
		bank.deposite();	
		bank.display();
		bank.withdraw();
	}

}