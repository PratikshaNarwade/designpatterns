package com.jspiders.designpatterns.creational;

public class SingletonEager {
	
	private static SingletonEager singletoneager = new SingletonEager();
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getObject() {
		return singletoneager;
		
	}

}
