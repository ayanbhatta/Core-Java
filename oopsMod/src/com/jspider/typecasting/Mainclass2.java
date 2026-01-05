package com.jspider.typecasting;
class Demo{
	void test() {
		System.out.println("Test running...");
	}
}
class Sample extends Demo{
	void run() {
		System.out.println("Run running");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ref = new Sample();
		Demo d = ref;	//UPCASTING  
		ref.test();
		ref.run();
		d.test();
		//d.run();//in upcasting sub-class properties cannot be accessed by super class obj
	}

}
