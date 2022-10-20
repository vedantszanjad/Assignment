package com.yash.programthree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
		ConstructorMessage cm = (ConstructorMessage) app.getBean("id");
		cm.display();
	}
}
