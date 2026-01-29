package com.jspider.exceptionhandling;
class CustomException extends Exception{
	CustomException(){}
	CustomException(String msg){
		super(msg);//calling exception constructor
	}
}
class Trigger{
	static void logic(int n) throws CustomException{
		if(n%2==0 &&n%5==0) {
			throw new CustomException("Custome Exception");
		}
	}
}
public class Mainclass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Trigger.logic(12);
			Trigger.logic(10);
			Trigger.logic(15);
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}

}
