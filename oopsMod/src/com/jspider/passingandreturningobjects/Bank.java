package com.jspider.passingandreturningobjects;

import java.util.Scanner;

public class Bank {
	static void displayAccountInfo(Account a) {
		if(a != null) {
			if(a != null) {
			System.out.println("Account number "+ a.accNum);
			System.out.println("Account balance "+ a.accBalance);
			}
		}
	
	}
	static Account createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number");
		long accNum = sc.nextLong();
		System.out.println("Enter Account Balance");
		double accBalance = sc.nextDouble();
		Account a = new Account(accNum,accBalance);
		return a;
	}
}