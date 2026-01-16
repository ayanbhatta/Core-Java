package com.jspider.encapsulation;

public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = Demo.getDemo();
		Demo d2 = Demo.getDemo();
		Demo d3 = Demo.getDemo();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("==================");
		Sample s1 = Sample.getSample();
				Sample s2 = Sample.getSample();
				Sample s3 = Sample.getSample();
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
	}

}
