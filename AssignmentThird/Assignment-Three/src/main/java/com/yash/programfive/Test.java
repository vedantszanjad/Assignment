package com.yash.programfive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee emp = (Employee) app.getBean("p");
		emp.print();
		Employee emp1 = (Employee) app.getBean("s");
		emp1.print();
		Employee emp2 = (Employee) app.getBean("c");
		emp2.print();
		
	}
}
