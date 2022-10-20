package com.yash.programtwo;

public class Rectangle extends Shape {

	private String msg;
	private Triangle tri;
	
	
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Triangle getTri() {
		return tri;
	}

	public void setTri(Triangle tri) {
		this.tri = tri;
	}

	

	public Rectangle(String msg, Triangle tri) {
		super();
		this.msg = msg;
		this.tri = tri;
	}

	@Override
	public void draw() {
		System.out.println("This is " + msg);
		tri.draw();
	}

}
