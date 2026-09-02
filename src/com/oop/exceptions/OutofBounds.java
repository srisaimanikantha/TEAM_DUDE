package com.oop.exceptions;
class Animal{
	
}
class Lion extends Animal{
	
	
}
class Tiger extends Animal{
	
}

public class OutofBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[2];
		
		System.out.println(arr[2]); // a[2]->arrayIndExc
		
		String str="ABCD";
		
		System.out.println(str.charAt(1)); // charAt(5) -> StrIndExc
		
		Animal animal =new Lion();
		
		//Tiger t=(TIger) animal gives ClassCastException (Direct Narrowing Reference)
		
		if(animal instanceof Lion) {
			Lion l=(Lion) animal;
		}
		else if(animal instanceof Tiger) {
			Tiger t=(Tiger) animal;
		}
		

	}

}
