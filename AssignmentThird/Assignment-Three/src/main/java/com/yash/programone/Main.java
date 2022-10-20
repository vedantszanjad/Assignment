package com.yash.programone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) {
		
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		City objSCBean =(City) objAC.getBean("city");
		City objSCBean1 =(City) objAC.getBean("city1");
		City objSCBean2 =(City) objAC.getBean("city2");
		City objSCBean3 =(City) objAC.getBean("city3");
		objSCBean.show();	
		objSCBean1.show();		
		objSCBean2.show();
		objSCBean3.show();
		
	}
}
