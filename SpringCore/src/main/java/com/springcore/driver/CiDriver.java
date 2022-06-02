package com.springcore.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Addition;
import com.springcore.ci.Person;

public class CiDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");

		Person person = (Person) context.getBean("person");

		System.out.println(person);

//		Addition add = (Addition) context.getBean("add");
//		System.out.println(add.a+ " " + add.b);

	}

}
