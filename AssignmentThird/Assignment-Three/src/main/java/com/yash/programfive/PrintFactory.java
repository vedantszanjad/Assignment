package com.yash.programfive;

public class PrintFactory {

	public static Employee getPrint()
	{
		return new Manager();
	}
	
	public static Employee getPrintSuper()
	{
		return new Supervisor();
	}
	
	public static Employee getPrintClerk()
	{
		return new Clerk();
	}
}
