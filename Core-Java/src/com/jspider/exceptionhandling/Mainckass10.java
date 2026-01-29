package com.jspider.exceptionhandling;
class InvalidMobileNumberException extends Exception{
	InvalidMobileNumberException(){}
	InvalidMobileNumberException(String msg){
		super(msg);//calling exception constructor
	}
}
class CheckMobileNumber{
	static void check(String mobile) throws InvalidMobileNumberException{
		if(mobile.length()!=10) {
			throw new InvalidMobileNumberException(mobile+" is Invalid");
		}
	}
}
public class Mainckass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CheckMobileNumber.check("12345678901");
		}catch(InvalidMobileNumberException e) {
			System.out.println(e.getMessage());
		}
	}

}
