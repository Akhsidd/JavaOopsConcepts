package com.exceptionhandling;

public class exceptionhandling {

	public static void main(String[] args) {
	int	i = 10;
	int	j = 0;
	int	k = 5;
		
		try {
			System.out.println(i/j);
		}
		catch(ArithmeticException e){
			System.out.println("e");
		}
		finally {
			System.out.println("It is finally excepted");
		}
		
		System.out.println("i/k = " + i/k);
	}

}
