package com.jspider.runtimepolymorphism;

public class Card {
	void swipe() {
		System.out.println("Please wait.......");
	}
}
class DebitCard extends Card{
	@Override
	void swipe() {
		System.out.println("Balance Reduced.......");
	}
}
class CreditCard extends Card{
	@Override
	void swipe() {
		System.out.println("Due Increase.......");
	}
}
