package com.interfacee;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iphone iphone = new Iphone(); //Assigning the class to object and
		iphone.audiocall(); 		//calling the methods using Object name 
		iphone.videocall();
		iphone.sms();
		
		phone.mms(); // calling the method using CLASS name Since method is Static
		
		
	}

}
