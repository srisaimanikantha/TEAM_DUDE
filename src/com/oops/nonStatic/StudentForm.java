package com.oops.nonStatic;
class Student{
	int rollno;
	String name;
	int age;
	String gender;
	Student(){
		rollno=00000000;
		name="Give me a name";
		age=00;
		gender="Describe your Gender";
	}
	public void studentDetails() {
		System.out.println("RollNo: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("Gender: "+gender);
	}
}


public class StudentForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.rollno=1;
		s1.name="ManiKanta";
		s1.age=22;
		s1.gender="Male";
		s1.studentDetails();
		System.out.println("=====================================");
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Kavya";
		s2.age=21;
		s2.gender="Female";
		s2.studentDetails();
		System.out.println("===========================");
		Student s3=new Student();
		s3.studentDetails();

	}

}
