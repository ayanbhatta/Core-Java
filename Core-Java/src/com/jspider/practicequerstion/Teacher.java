package com.jspider.practicequerstion;

public class Teacher extends Person {
    String subject;
    double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age); // Calls the Person constructor
        this.subject = subject;
        this.salary = salary;
    }

    public void displayTeacherDetails() {
        displayInfo(); // Inherited method
        System.out.println("Subject: " + subject + ", Salary: ₹" + salary);
    }
}
