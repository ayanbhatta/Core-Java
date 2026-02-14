package com.jspider.practicequerstion;

public class Mainclass3 {
	    public static void main(String[] args) {
	        // Create a student object
	        Student s1 = new Student(101, "Ayan", 85.5);
	        System.out.println("Student: " + s1.getName() + " | Marks: " + s1.getMarks());
	        s1.setMarks(92.0);
	        System.out.println("New Marks: " + s1.getMarks());
	        s1.setMarks(105.0); // Should trigger error message
	        s1.setMarks(-10);   // Should trigger error message

	        System.out.println("Final Marks (unchanged): " + s1.getMarks());
	    }
}

