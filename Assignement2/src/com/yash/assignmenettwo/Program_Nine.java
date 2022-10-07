package com.yash.assignmenettwo;

//WAP to demonstrate the use of clone method. Clone one object of Employee class :-
//empId, empName, empSalary and deptname. When you clone object of class 
//Employee change the values. With the help of instanceOf check that the newly 
//created object is belong to Employee class or not. Also compare both object are same 
//or not

public class Program_Nine implements Cloneable
{
	int empId; 
	String empName; 
	int empSalary;
	String deptname;
	
	public Program_Nine(int empId, String empName, int empSalary, String deptname) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptname = deptname;
	}
	
	public Object clone () throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Program_Nine one = new Program_Nine(101,"Vedant",12000,"JAVA");
		Program_Nine two = new Program_Nine(102,"AKshay",1000,"Testing");
		two =(Program_Nine) one.clone();
		
		System.out.println(two.deptname);
		System.out.println(two.empId);
		System.out.println(two.empName);
		System.out.println(two.empSalary);
		
		if (two instanceof Program_Nine) 
		{
			System.out.println("Yes It Is Object Of Class ProgramNine");
		}
		System.out.println(one == two);
		
	}
}
