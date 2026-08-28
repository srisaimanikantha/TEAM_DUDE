package com.oop.prj.enc;
class User{
	private String first_name;
	private String last_name;
	private String ph_no;
	private String name;
	private String email;
	private String gender;
	public User() {
		System.out.println("Set the first name");
		System.out.println("Set the first name");
		System.out.println("Set the Phone Number");
		System.out.println("Set the User Name");
		System.out.println("Set the email");
		System.out.println("Discribe Your gender");
		System.out.println("==============");
		
	}
	public User(String first_name, String last_name,  String name, String email, String gender, String ph_no) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.ph_no = ph_no;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPh_no() {
		return ph_no;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}	
	public void UserDetails() {
		System.out.println("First Name:"+first_name);
		System.out.println("Last Name:"+last_name);
		System.out.println("Mobile Number:"+ph_no);
		System.out.println("User Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Gender:"+gender);
	}
}
public class UserItem {
	public static void main(String[] args) {
		User u1=new User();
		u1.setFirst_name("Siva");
		u1.setLast_name("sankar");
		u1.setPh_no("9392731584");
		u1.setName("siva Sankar Reddy");
		u1.setGender("Male");
		u1.UserDetails();
		System.out.println("===============");

	}

}
