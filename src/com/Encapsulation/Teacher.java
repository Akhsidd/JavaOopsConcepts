package com.Encapsulation;

public class Teacher {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Student stud = new Student();

	        stud.setName("Akhil");
	        stud.setAge(24);
	        stud.setStudentAttendance(false);
	        stud.getStudentAttendance();
	        
	        System.out.println("Name: " + stud.getName());
	        System.out.println("Age: " + stud.getAge());
	    }
	}
