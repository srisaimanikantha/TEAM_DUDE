package com.oop.prj.enc;
class B{
	B(){
		System.out.println("No-arg Constructor");
	}
	B(int Z){
		this();
		System.out.println("Z:"+Z);
	}
}
public class ExmapleChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//B obj1=new B();
		
		B obj2=new B(6);

	}

}
