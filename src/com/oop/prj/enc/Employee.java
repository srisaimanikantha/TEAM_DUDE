package com.oop.prj.enc;

class Employ{
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	public Employ() {
}
	
public Employ(String name, double basicSalary) {
	
		this.name = name;
		this.basicSalary = basicSalary;
		System.out.println("1st contructor for employee name and basic Salary");
	}
public Employ(String name, double basicSalary,double hra) {

	this(name,basicSalary);
	this.hra=hra;
	System.out.println("2nd contructor for hra");
}
public Employ(String name, double basicSalary,double hra,double da) {

	this(name,basicSalary,hra);
	this.da=da;
	System.out.println("3rd contructor for da");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getBasicSalary() {
	return basicSalary;
}

public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}

public double getHra() {
	return hra;
}

public void setHra(double hra) {
	this.hra = hra;
}

public double getDa() {
	return da;
}

public void setDa(double da) {
	this.da = da;
}
public void Salaryslip(){
	System.out.println(this.name);
	System.out.println(this.basicSalary);
	if(this.hra>0.0)

	System.out.println(this.hra);
	if(this.da>0.0)
	System.out.println(this.da);
}
	
}
public class Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ e1=new Employ("Rahul Sharma",25000);
		e1.Salaryslip();
		System.out.println("====================");
		Employ e2=new Employ("Manikanta",30000,8000);
		e2.Salaryslip();
		System.out.println("=====================");
		Employ e3=new Employ("Hemanth",50000,10000,5000);
		e3.Salaryslip();
		
		
		
		

	}

}
