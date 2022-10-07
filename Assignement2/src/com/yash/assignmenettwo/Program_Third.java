package com.yash.assignmenettwo;

import java.time.LocalDate;

//Create Class STudent which will have following class members: - rollno, accountno, 

//custname, cust_address, cust_dob, cust_account_opening_date, Branch_Obj. 
//Class Branch :- branch_id, branch_name, branch_address.
//Class Customer_Account_Statement:- CAID, CustId, amount, deposit_withdrawl, 
//deposit_date. 
//Now you have to create Customer, Branch and CustomerAccountStatement class 
//object. CustomerAccountStatement will have multiple records as one customer will 
//deposit and withdrawal the amount. So you need to print the statement as per the 
//CustomerId.
//What is expected:- you will create multiple object of customer class. Also you have to 
//create multiple object of the CustomerAccountStatement and while printing detail of 
//CustomerAccountStatement you have to print detail of Customer.





class Customer_Account_Statements 
{
	long cAID;
	long CustId;
	long amount;
	long deposit_withdrawl;
	private LocalDate deposit_date;
	Student std;
	Branch branch;


	public Customer_Account_Statements(long cAID, long custId, long amount, long deposit_withdrawl,
			LocalDate deposit_date, Student std, Branch branch) {
		super();
		this.cAID = cAID;
		CustId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
		this.std = std;
		this.branch = branch;
	}





	public void cusInfo(Customer_Account_Statements cas)
	{
		System.out.println(cas.cAID);
		System.out.println(cas.CustId);
		System.out.println(cas.amount);
		System.out.println(cas.deposit_withdrawl);
		System.out.println(std.getRollno());
		System.out.println(std.getAccountno());
		System.out.println(std.getCust_address());
		System.out.println(std.getCust_address());
		System.out.println(std.getCust_dob());
		System.out.println(std.getCust_account_opening_date());
		System.out.println(branch.getBranch_id());
		System.out.println(branch.getBranch_name());
		System.out.println(branch.getBranch_address());
		
	}





	@Override
	public String toString() 
	{
		return "Customer_Account_Statements [cAID=" + cAID + ", CustId=" + CustId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + ", std=" + std + "]";
	}
	
	
	
}


class Branch  {
	int branch_id;
	String branch_name;
	String branch_address;
	
	public Branch(int branch_id, String branch_name, String branch_address) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_address() {
		return branch_address;
	}
	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}
	
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
				+ "]";
	}

	
}



 class Student
 {
	int rollno;
	long accountno;
	String custname;
	String cust_address;
	public LocalDate cust_dob;
	public LocalDate cust_account_opening_date;
	Branch branch;
	
	public void studentInfo(Student std)
	{
	
		System.out.println(std.rollno);
		System.out.println(std.accountno);
		System.out.println(std.custname);
		System.out.println(std.cust_address);
		System.out.println(std.cust_dob);
		System.out.println(std.cust_account_opening_date);
		System.out.println(branch.getBranch_id());
		System.out.println(branch.getBranch_name());
		System.out.println(branch.getBranch_address());
		
	}
	
	
	
Student(int rollno, long accountno, String custname, String cust_address, LocalDate cust_dob,
			LocalDate cust_account_opening_date, Branch branch) 
	{
		super();
		this.rollno = rollno;
		this.accountno = accountno;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		this.branch = branch;
	}



	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public LocalDate getCust_dob() {
		return cust_dob;
	}
	public void setCust_dob(LocalDate cust_dob) {
		this.cust_dob = cust_dob;
	}
	public LocalDate getCust_account_opening_date() {
		return cust_account_opening_date;
	}
	public void setCust_account_opening_date(LocalDate cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", accountno=" + accountno + ", custname=" + custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", branch=" + branch + "]";
	}
	
}




public class Program_Third {
	public static void main(String[] args) 
	{
		System.out.println("First ");
		Branch branch = new Branch(101, "SBI", "Gadge Nagar Amravati");
		System.out.println(branch);
		Student std = new Student(1, 132123, "Mayur", "Katraj Pune", LocalDate.of(1997, 12, 12), LocalDate.of(2022, 10, 2), branch);
		System.out.println(std);
		Customer_Account_Statements cas = new Customer_Account_Statements(123, 123213, 10000, 2456, LocalDate.of(2022, 11, 2), std, branch);
		System.out.println(cas);
		System.out.println("");
		System.out.println("Second ");
		Branch branchOne = new Branch(104, "SBI", "Gadge Nagar Amravati");
		System.out.println(branchOne);
		Student stdOne = new Student(3, 132344, "Vedant", "Mundhawa Pune", LocalDate.of(1997, 11, 1), LocalDate.of(2022, 10, 12), branchOne);
		System.out.println(stdOne);
		Customer_Account_Statements casOne = new Customer_Account_Statements(133, 123213, 10000, 3356, LocalDate.of(2022, 11, 2), stdOne, branchOne);
		System.out.println(casOne);

	}
}

