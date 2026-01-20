package com.jspider.enums;
enum Season{
	SUMMER,WINTER,MONSOON,SPRING,AUTUMN
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season choice = Season.AUTUMN;
		switch(choice) {
		case SUMMER:	System.out.println("Sunny");
		break;
		case WINTER: 	System.out.println("Cold");
		break;
		case MONSOON:	System.out.println("rainy");
		break;
		case SPRING:	System.out.println("Breezy");
		break;
		case AUTUMN:	System.out.println("Brown");
		break;
		default:	System.out.println("Bangalore Weather");
		
		}
	}

}
