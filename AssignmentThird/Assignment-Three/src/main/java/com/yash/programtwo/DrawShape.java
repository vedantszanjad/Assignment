package com.yash.programtwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Parallelogram para = (Parallelogram) app.getBean("para");
		para.draw();
	}
}
