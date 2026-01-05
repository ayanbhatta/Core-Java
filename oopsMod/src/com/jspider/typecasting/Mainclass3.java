package com.jspider.typecasting;
class A{
	void test() {}
}
class B extends A{
	void disp() {}
}
class C extends B{
	void play() {}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.test();
		c.disp();
		c.play();
		B b = c;//UPCASTING C-->B
		b.disp();
		b.test();
		A a = b;//UPCASTING B-->A
		a.test();
		A a2 = c;//UPCASTING C-->A
		a2.test();
	}

}
