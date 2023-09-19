package com.jspiders.designpatterns.creational;

public class SingletonLazy {
	
	private static SingletonLazy singletonlazy;
	
	private SingletonLazy() {
		System.out.println("Constructor Accessed");
	}
	
	public static SingletonLazy getObject() {
		if(singletonlazy == null) {
			singletonlazy = new SingletonLazy();
		}
		return singletonlazy;
		
	}

}
