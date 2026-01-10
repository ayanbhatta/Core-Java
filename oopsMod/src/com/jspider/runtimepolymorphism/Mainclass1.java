package com.jspider.runtimepolymorphism;

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DebitCard dc = new DebitCard();
		Shop.payment(dc);
		CreditCard cd = new CreditCard();
		Shop.payment(cd);
	}

}
