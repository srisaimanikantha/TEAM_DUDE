package com.oop.prj.enc;
class Hotel{
	private String hotelname;
	private String street;
	private String city;
	private String state;
	private long pincode;
	private int rating;
	
	public Hotel(){
		System.out.println("Describe your hotelName:");
		System.out.println("Describe your street:");
		System.out.println("enter the city");
		System.out.println("set the state name");
		System.out.println("enter your pincode");
		System.out.println("give me rating for our hotel:");
		
		System.out.println("======================");
		
	}

	public Hotel(String hotelname, String street, String city, String state, long pincode, int rating) {
		super();
		this.hotelname = hotelname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.rating = rating;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	public void hotel() {
		System.out.println(hotelname);
		System.out.println(street);
		System.out.println(city);
		System.out.println(state);
		System.out.println(pincode);
		System.out.println(rating);
	}
	
}
public class HotelDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel h1=new Hotel();
		h1.setHotelname("The paradise");
		h1.setStreet("Anna nagar");
		h1.setCity("Chennai");
		h1.setState("TamilNadu");
		h1.setPincode(610020);
		h1.setRating(4);
		h1.hotel();

	}

}
