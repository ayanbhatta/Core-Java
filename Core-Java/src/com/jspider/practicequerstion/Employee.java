package com.jspider.practicequerstion;

class Employee {
 String name;

 	Employee(String name) {
 		this.name = name;
 	}

 	void work() {
 		System.out.println(name + " is working...");
 	}
}

class Manager extends Employee {
	Manager(String name) {
		super(name);
	}
	void approveLeave() {
		System.out.println("Leave approved by Manager: " + name);
	}
}
