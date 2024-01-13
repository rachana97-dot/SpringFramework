package com.SpringFramework1.SpringFrameworkProg1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFramework1.SpringFrameworkProg1.beans.student;

//write the spring program using xml file
public class main {
	public static void main(String[]args) {
		
		//String config_loc = "/SpringFrameworkProg1/src/main/resources/beans.xml";
		//ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		//we provide path like that or we provide direct beans.xml file name like belove
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		   student st = (student)context.getBean("stdId");
		   st.display(); 
		   
		   System.out.println("============================");
		   
		   student st2 = (student)context.getBean("stdId2");
		   st2.display(); 

		   
	}
}
