package com.oop.isaorINN;
class Electronics{
	String category;
	Electronics(String category){
		this.category=category;
	}
}

class HairDryer extends Electronics{
	String usage;

	HairDryer(String category) {
		super(category);
		this.usage=usage;
	}
	
}

public class UseElectronics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HairDryer h1=new HairDryer("Father");
	
		

	}

}
