package com.jspider.interfaces;
interface Demo{
	static void test()
	{
		System.out.println("test....");
	}
}

interface Delta{
	default void help(){
		System.out.println("help...");
	}
}
class Example implements Delta{
	
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.test();
		
		Delta ref = new Example();
		ref.help();
	}

}
