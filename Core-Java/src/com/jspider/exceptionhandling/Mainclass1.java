package com.jspider.exceptionhandling;

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starts");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("/ by zero");
		}
		System.out.println("Ends");
	}

}
