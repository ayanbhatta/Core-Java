package com.jspider.practicequerstion;


public class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        setMarks(marks); // Using the setter here to ensure validation even during creation
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks updated successfully for " + name);
        } else {
            System.out.println("Error: Invalid marks (" + marks + "). Must be between 0 and 100.");
        }
    }
}
