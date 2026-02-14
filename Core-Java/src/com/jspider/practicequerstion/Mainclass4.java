package com.jspider.practicequerstion;

public class Mainclass4 {
	    public static void main(String[] args) {
	        Employee[] staff = {
	            new Employee("Ayan"),
	            new Manager("Suresh"), // Manager is an Employee
	            new Employee("Rahul"),
	            new Manager("Priya")   // Manager is an Employee
	        };

	        for (Employee emp : staff) {
	            if (emp instanceof Manager) {
	                Manager m = (Manager) emp;
	                m.approveLeave();
	            } else {
	                System.out.println("Access Denied: " + emp.name + " is not a Manager.");
	            }
	        }
	    }
}
