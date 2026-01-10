package com.jspider.runtimepolymorphism;

public class Facebook {
	void disp() {
		
	}
}
class FacebookMobile extends Facebook{
	@Override
	void disp() {
		System.out.println("Disp in mobile...");
	}
}
class FacebookWebsite extends Facebook{
	@Override
	void disp() {
		System.out.println("Disp in websitew...");
	}
}

