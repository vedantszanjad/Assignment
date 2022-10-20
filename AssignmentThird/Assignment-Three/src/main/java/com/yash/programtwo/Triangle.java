package com.yash.programtwo;

public class Triangle extends Shape {

	public String msg;
	
	
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Triangle(String msg) {
		super();
		this.msg = msg;
	}


	@Override
	public void draw() {
		
			System.out.println("This Is " + msg);
	}

	
}
