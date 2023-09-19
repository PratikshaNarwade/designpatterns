package com.jspiders.designpatterns.creational;

public class Contact {
	
	public String firstName;
	public String lastName;
	public String MiddleName;
	public String nickName;
	public int id;
	public int contactNo;
	public int landlineNo;
	public String email;
	public String Address;
	public int age;
	public String gender;
	
	public Contact(String firstName, String lastName, String middleName, String nickName, int id, int contactNo,
			int landlineNo, String email, String address, int age, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		MiddleName = middleName;
		this.nickName = nickName;
		this.id = id;
		this.contactNo = contactNo;
		this.landlineNo = landlineNo;
		this.email = email;
		Address = address;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", MiddleName=" + MiddleName
				+ ", nickName=" + nickName + ", id=" + id + ", contactNo=" + contactNo + ", landlineNo=" + landlineNo
				+ ", email=" + email + ", Address=" + Address + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
