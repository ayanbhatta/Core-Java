package com.jspider.encapsulation;

public class Sample {
	private Sample() {
		
	}
	private static Sample ref = new Sample();
	public static Sample getSample() {
		return ref;
	}
}
