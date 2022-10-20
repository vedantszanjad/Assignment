package com.yash.programsix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    
public static void main(String[] args) {
    ApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
    Vehicle vl=(Vehicle)app.getBean("vehicle");
    Vehicle vl1=(Vehicle)app.getBean("vehicle1");
    Vehicle vl2=(Vehicle)app.getBean("vehicle2");
    Vehicle vl3=(Vehicle)app.getBean("vehicle3");
    vl.displayVehicle();
    vl1.displayVehicle();
    vl2.displayVehicle();
    vl3.displayVehicle();

}
}
