package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.Contact;
import com.jspiders.designpatterns.creational.ContactBuilder;

public class BuilderMain {
	
	public static void main(String[] args) {
		
		Contact contact = new ContactBuilder().firstName("Pratiksha").lastName("Narwade").middleName("Sitaram").age(22).getContact();
		System.out.println(contact);
		
		Contact contact2 = new ContactBuilder().firstName("Pratiksha").lastName("Narwade").middleName("Sitaram").age(22).nickName("Tai").
				gender("Female").contactNo(123456789).landlineNo(456789).address("Wakad").email("pratiksha@gmail.com").id(100).getContact();
		System.out.println(contact2);
	}

}
