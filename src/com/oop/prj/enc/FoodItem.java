package com.oop.prj.enc;
class Food{
	private String Restaurantname;
	private String foodname;
	private boolean veg;
	private String category;
	private int price;
	private double rating;
	public  Food() {
		System.out.println("set the restaurant name:");
		System.out.println("set the  food name:");
		System.out.println("Describe it's veg or non-veg:");
		System.out.println("set the restaurant name:");
		System.out.println("set the restaurant name:");
		System.out.println("set the restaurant name:");
		
		
		System.out.println("=========================");
	}
	public Food(String restaurantname, String foodname, boolean veg, String category, int price, double rating) {
		super();
		Restaurantname = restaurantname;
		this.foodname = foodname;
		this.veg = veg;
		this.category = category;
		this.price = price;
		this.rating = rating;
	}
	public String getRestaurantname() {
		return Restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		Restaurantname = restaurantname;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void FoodDetails() {
		System.out.println(Restaurantname);
		System.out.println(foodname);
		System.out.println(veg);
		System.out.println(category);
		System.out.println(price);
		System.out.println(rating);
	}
	
}

public class FoodItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f1=new Food();
		f1.setRestaurantname("Tattibellam");
		f1.setFoodname("Chicken Biryani:");
		f1.setVeg(false);
		f1.setCategory("Main Course");
		f1.setPrice(280);
		f1.setRating(4.5);
		f1.FoodDetails();
		
		
		
		

	}

}
