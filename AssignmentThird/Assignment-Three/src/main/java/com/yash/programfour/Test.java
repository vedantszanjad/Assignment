package com.yash.programfour;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
		SetterMessage setter = (SetterMessage) app.getBean("idsetter");
		setter.display();
	}
}
