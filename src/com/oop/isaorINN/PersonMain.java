package com.oop.isaorINN;

class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [id=" + id+ ", name="+name+"]";
	}
	
	
}
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person(101,"Mani");
		System.out.println(p1);
	}

}
