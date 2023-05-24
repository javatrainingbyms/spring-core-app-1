package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		/*
		//old way of creating object
			Employee ob=new Employee();
			ob.setEno(101);
			ob.setName("abc");
			System.out.println(ob);
		*/
		//now here we will ask for the object to our spring-container.
		
			//step-1 (create the spring-container object)
			ApplicationContext context=new ClassPathXmlApplicationContext("info.xml");
		
			//step-2 (call the getBean method for demanding the object)
			Employee emp=context.getBean("e1", Employee.class);
			System.out.println(emp);
		
		
	}

}
