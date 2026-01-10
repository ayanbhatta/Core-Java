package com.jspider.runtimepolymorphism;

public class Shop {
	static void payment(Card c) {
		if(c != null) {
			c.swipe();
		}
	}
}
