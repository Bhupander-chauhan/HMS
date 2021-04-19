package com.example.demo.guests;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="guest")
public class Guest {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String age;
	private String Address;
	private String Aadhar;
	public Guest(String id, String firstName,String lastName, String age, String address, String aadhar) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		Address = address;
		Aadhar = aadhar;
		
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAadhar() {
		return Aadhar;
	}
	public void setAadhar(String aadhar) {
		Aadhar = aadhar;
	}
	public String tostring() {
		return "guest First Name : "+firstName+" Last Name : "+lastName+" age : "+age+" Address : "+Address+" Aadhar : "+Aadhar;
		
	}
	
	

}
