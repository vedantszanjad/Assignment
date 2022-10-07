package com.yash.assignmenettwo;

//With the help of finalize method print the how many objects are currently a class is 
//having and which object is going to be freed from the memory with its hashcode
public class Program_Eight
{
	Program_Eight()
	{
		System.out.println("Object Is Created");
	}
	
	protected void finalize()
	{
		System.out.println("Object Is Destroyed");
	}
	
	
	public static void main(String[] args) 
	{
		Program_Eight pe = new Program_Eight();
		//System.out.println(pe.hashCode());
		//System.out.println(pe.hashCode());
		pe = null;// By giving Null Refrence
		//System.out.println(pe);
		Program_Eight p1 = new Program_Eight();
		//System.out.println(p1.hashCode());
		Program_Eight p2 = new Program_Eight();
		//System.out.println(p2.hashCode());
		p1 = p2; //By Assigning
		new Program_Eight();//anoymonous object refrence
		//System.out.println(p1.hashCode());
		//System.out.println(pe.hashCode());
		//System.out.println(p2.hashCode());
		System.gc();
	}
	//System.out.println("Four Objects Are Created And Two Objects Are Destroyed");
}
