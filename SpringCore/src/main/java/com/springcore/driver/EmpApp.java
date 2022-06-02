package com.springcore.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

public class EmpApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/collections/collectionsconfig.xml");
		
		Employee emp1 = (Employee) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getEmpProps());
		

	}

}
