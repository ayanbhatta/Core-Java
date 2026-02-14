package com.jspider.practicequerstion;

public class Newstudent extends Person{
	    String grade;
	    int rollNumber;

	    public Newstudent(String name, int age, String grade, int rollNumber) {
	        super(name, age); // Calls the Person constructor
	        this.grade = grade;
	        this.rollNumber = rollNumber;
	    }

	    public void displayStudentDetails() {
	        displayInfo(); // Inherited method
	        System.out.println("Roll No: " + rollNumber + ", Grade: " + grade);
	    }
}
