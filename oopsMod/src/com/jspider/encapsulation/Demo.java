package com.jspider.encapsulation;

public class Demo {
	private Demo() {
		
	}
	private static Demo ref = null;
	public static Demo getDemo() {
		if(ref == null) {
			ref = new Demo();
		}
		return ref;
	}
}
