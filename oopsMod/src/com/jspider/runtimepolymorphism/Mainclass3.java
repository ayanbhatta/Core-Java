package com.jspider.runtimepolymorphism;
class Calculator{
	void add(int... a) {
		int sum =0 ;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add(12,13);
		c.add(12,13,14);
		c.add(12,13,23,34);
		c.add(12);
	}

}
