package com.jspider.practicequerstion;

public class Mainclass6 {//teacher & person & newStudent
	public class SchoolApp {
	    public static void main(String[] args) {
	        Teacher t1 = new Teacher("Mr. Ayan", 35, "Java Programming", 75000);
	        Newstudent s1 = new Newstudent("Rahul", 20, "A", 101);

	        System.out.println("--- Teacher Details ---");
	        t1.displayTeacherDetails();

	        System.out.println("\n--- Student Details ---");
	        s1.displayStudentDetails();
	    }
	}

}
