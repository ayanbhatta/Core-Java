package com.jspider.exceptionhandling;
	

public class Data implements Cloneable{
	int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data ref = new Data();
		ref.size=500;
		try {
			Data copy = (Data)ref.clone();
			System.out.println(copy.size);
		}catch(CloneNotSupportedException e) {
			System.out.println("Clone Failed");
		}
	}


}
