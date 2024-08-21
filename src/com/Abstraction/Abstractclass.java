package com.Abstraction;

public abstract class Abstractclass implements laptop {

	//abstract class can have abstract methods and non abstract methods//
    public void enter()
    {
	  System.out.println("we have enter key");
  	}
	
	public void shift()
	 {
		  System.out.println("we have shift key");
	  }
	
	//but for non abstract methods we have to give keyword Abstract//
	public abstract void space();
	
	public abstract void control();

}
