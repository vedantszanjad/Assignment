package com.yash.assignmenettwo;

import java.time.LocalDate;

public class Program_Ten 
{
	int emp_id;
	String emp_name;
	long emp_salary;
	String emp_address;
	private LocalDate emp_dob;
	private LocalDate emp_doj;
	
	
	
	public Program_Ten(int emp_id, String emp_name, long emp_salary, String emp_address, LocalDate emp_dob,
			LocalDate emp_doj) 
	{
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_address = emp_address;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}



	@Override
	public String toString()
	{
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_address="
				+ emp_address + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
	
	public static void main(String[] args) 
	{
		Program_Ten emp = new Program_Ten(101,"Jaydip Jadhav", 22000, "Anant Vihar Colony,Amravati",LocalDate.of(1997, 10, 12),LocalDate.of(2020, 10, 23));
		System.out.println(emp);
	}
}
