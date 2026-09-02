package com.oop.prj.enc;
class student{
	private String name;
	private double tenthper;;
	private double interper;
	private double btechper;
	public student() {
		
	}
	public student(String name,double tenthper) {
		this.name=name;
		this.tenthper = tenthper;
	}
	public student(String name,double tenthper, double interper) {
		this(name,tenthper);
		this.interper=interper;
	}
	public student(String name,double tenthper, double interper,double btechper) {
		this(name,tenthper,interper);
		this.btechper=btechper;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getTenthper() {
		return tenthper;
	}
	public void setTenthper(double tenthper) {
		this.tenthper = tenthper;
	}
	public double getInterper() {
		return interper;
	}
	public void setInterper(double interper) {
		this.interper = interper;
	}
	public double getBtechper() {
		return btechper;
	}
	public void setBtechper(double btechper) {
		this.btechper = btechper;
	}
	public void Studentdetails() {
		System.out.println(this.name);
		System.out.println(this.tenthper);
		if(this.interper>0.0)
		System.out.println(this.interper);
		if(this.btechper>0.0)
		System.out.println(this.btechper);
	}
	
}

public class StudentDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student("Shiva",78.9);
		s1.Studentdetails();
		System.out.println("==============");
		
		student s2=new student("Manikanta",87.8,67.5);
		s2.Studentdetails();
		System.out.println("=============");
		
		student s3=new student("Hemant",87.6,78.8,88.4);
		s3.Studentdetails();

	}


}
