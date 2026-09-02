package com.oops.nonStatic;
class Employee{
	static String company="Meta";
	String name;
	int Salary;
Employee(){
	name="Give me a Your name";
	Salary=0;
	
}
public Employee(String name, int Salary) {
	this.name=name;
	this.Salary=Salary;
}
 public void employee(){
	 System.out.println(this);
	 System.out.println("company name: "+Employee.company);
	 System.out.println("Name:"+this.name);
	 System.out.println("Salary: "+this.Salary);
	
}
}

public class EmployeeForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("ManiKanta",200000);

		e1.employee();
		
		System.out.println("=========================");
		Employee e2=new Employee("Hemanth",1500000);
		
		e2.employee();
		System.out.println("======================================");
		Employee e3=new Employee();
		e3.employee();

	}

}
