package com.jspider.exceptionhandling;
class InvalidPinCodeException extends RuntimeException{
	InvalidPinCodeException(){}
	InvalidPinCodeException(String msg){
		super(msg);
	}
}

class AddressVerifier{
	static void verifyPinCode(String pinCode) {
		if(pinCode.length()!= 6) {
			throw new InvalidPinCodeException(pinCode + " is Invalid");
		}
	}
}
public class Mainclass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AddressVerifier.verifyPinCode("456789");
			AddressVerifier.verifyPinCode("489");
			AddressVerifier.verifyPinCode("4567892");
		}catch(InvalidPinCodeException e) {
			e.printStackTrace();
		}
	}

}
