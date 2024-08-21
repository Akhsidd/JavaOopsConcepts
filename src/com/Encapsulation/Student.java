package com.Encapsulation;

public class Student {
	
//We use methods to control and hide the data
	
//Declaring variables in the class as private//
	
    private  String name;
    private  int age;
    private boolean isAttended;
//writing public methods in the class to set and get the values of variables//
   
    // Setter for name 
    public void setName(String name) 
    {
        this.name = name;
    }
    
    
    // Getter for name
    public  String getName()
    {
        return name;
    }

    // Setter for age
    public void setAge(int age) 
    {
        this.age = age;
    }
    
    // Getter for age
    public  int getAge() 
    {
        return age;
    }

  //Setter for attendance
    public void setStudentAttendance(boolean isAttended)
    {

    	this.isAttended = isAttended;
    }
    
    //getter for attendance
    public boolean getStudentAttendance() {
        if (isAttended) { 
            System.out.println("Student came to class");
        } 
        else
        {
            System.out.println("Student didn't come to class");
        }
        return isAttended;
    }
    
  
}

//Instance variables are declared in a class, but outside a method, constructor or any block. 
//Class variables/static variables are declared with the static keyword in a class,
//but outside a method, constructor or a block.