package com.interfacee;

public interface phone {

	public void audiocall();
	
	public void videocall();

//used from Java 8 version
	default void sms()
	{
		System.out.println("send sms");
	}
	
	static void mms()
	{
		System.out.println("send mms");
	}
	
//	used from Java 9 version
//	private void emergency()
//	{
//		System.out.println("Call 911 ");
//	}
}
