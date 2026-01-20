package com.jspider.enums;
enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d = Day.THURSDAY;
		System.out.println(d);
		System.out.println("=====================");
		Day[] arr = Day.values();
		for(int i =0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
