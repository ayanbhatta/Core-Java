package com.jspider.runtimepolymorphism;

public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookMobile fm = new FacebookMobile();
		FacebookAdapter.dispAda(fm);
		FacebookWebsite fw = new FacebookWebsite();
		FacebookAdapter.dispAda(fw);
	}

}
