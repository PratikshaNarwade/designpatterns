package com.jspiders.designpatterns.main;

import java.util.Scanner;

import com.jspiders.designpatterns.creational.Beverage;
import com.jspiders.designpatterns.creational.BlackTea;
import com.jspiders.designpatterns.creational.GreenTea;
import com.jspiders.designpatterns.creational.IceTea;
import com.jspiders.designpatterns.creational.NormalTea;

public class FactoryMain {
	
	private static Beverage beverage;
	
	public static void main(String[] args) {
		
		try {
			factory().ordered();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}
		
		public static Beverage factory() {
			
			System.out.println("1.Normal Tea\n2.Green Tea\n3.Black Tea\n4.Ice tea");
			System.out.println("Enter Your Choice!");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			sc.close();
			switch (choice) {
			case 1:
				beverage = new NormalTea();
				break;
				
			case 2:
				beverage = new GreenTea();
				break;
				
			case 3:
				beverage = new BlackTea();
				break;
				
			case 4:
				beverage = new IceTea();
				break;

			default:
				System.out.println("Invalid Choice");
				System.out.println("Tea is not ordered");
				break;
			}
			return beverage;
		}
	}


