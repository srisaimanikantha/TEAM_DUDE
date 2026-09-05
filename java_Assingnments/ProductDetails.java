package java_Assingnments;

import java.util.*;
class Product{
	String name;
	int id;
	int price;
	Product(String name, int id, int price){
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public void display() {
		System.out.println("Product Details: ");
		System.out.println("Product name: "+name);
		System.out.println("Product id: "+id);
		System.out.println("Price: "+price);
	}
}
public class ProductDetails {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name: ");
		String name = sc.nextLine();
		System.out.println("Enter the product id: ");
		int id = sc.nextInt();
		System.out.println("Enter the price: ");
		int price = sc.nextInt();
		Product product = new Product(name, id, price);
		product.display();
		sc.close();
		
	}

}
