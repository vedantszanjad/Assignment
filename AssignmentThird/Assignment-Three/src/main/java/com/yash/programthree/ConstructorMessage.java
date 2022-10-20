package com.yash.programthree;

public class ConstructorMessage 
{
	String msg = null;
	public ConstructorMessage(String msg)
	{
		this.msg = msg;
	}
	
	public void display()
	{
		System.out.println("Message "+ msg);
	}
}
