package com.yash.programtwo;

public class Parallelogram extends Shape{

	private String msg;
	private Rectangle rec;
	
	public Parallelogram()
	{
		
	}

	
	public Parallelogram(String msg, Rectangle rec) {
		super();
		this.msg = msg;
		this.rec = rec;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Rectangle getRec() {
		return rec;
	}


	public void setRec(Rectangle rec) {
		this.rec = rec;
	}


	@Override
	public void draw() {
		System.out.println("This Is " + msg);
		rec.draw();
	}

	

}
