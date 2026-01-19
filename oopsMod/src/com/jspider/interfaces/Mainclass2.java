package com.jspider.interfaces;
@FunctionalInterface
interface Writer{
	void writer();
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer pen = ()-> {
			System.out.println("Writing in pen");
		};
		pen.writer();
		Writer pencil = ()->{
			System.out.println("Writing in pencil");
		};
		pencil.writer();
	}

}
