package com.jspiders.designpatterns.structural;

public class Adapter extends Employee implements Event {

	@Override
	public void womensDay(Adapter adapter) {
		adapter.setId(1);
		adapter.setName("Radha");
		adapter.setEmail("Radha@email.com");
		System.out.println("Chief guest for the womens's day is " + adapter.getName());
		
	}

	@Override
	public void mensDay(Adapter adapter) {
		adapter.setId(1);
		adapter.setName("Ramesh");
		adapter.setEmail("Ramesh@email.com");
		System.out.println("Chief guest for the mens's day is " + adapter.getName());
		
	}

}
