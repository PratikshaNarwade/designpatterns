package com.jspiders.designpatterns.creational;

public class ContactBuilder {
	
	public String firstName;
	public String lastName;
	public String middleName;
	public String nickName;
	public int id;
	public int contactNo;
	public int landlineNo;
	public String email;
	public String address;
	public int age;
	public String gender;
	
	public ContactBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public ContactBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public ContactBuilder middleName(String middleName) {
		this.middleName = middleName;
		return this;
	}
	
	public ContactBuilder nickName(String nickName) {
		this.nickName = nickName;
		return this;
	}
	
	public ContactBuilder id(int id) {
		this.id = id;
		return this;
	}
	
	public ContactBuilder contactNo(int contactNo) {
		this.contactNo = contactNo;
		return this;
	}
	
	public ContactBuilder landlineNo(int landlineNo) {
		this.landlineNo = landlineNo;
		return this;
	}
	
	public ContactBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public ContactBuilder address(String address) {
		this.address = address;
		return this;
	}
	
	public ContactBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public ContactBuilder gender(String gender) {
		this.gender = gender;
		return this;
	}
	
	public Contact getContact() {
		Contact contact = new Contact(firstName, lastName, middleName, nickName, id, contactNo, landlineNo, email, address, age, gender);
		return contact;
		
	}

}
