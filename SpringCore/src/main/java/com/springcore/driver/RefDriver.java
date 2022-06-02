package com.springcore.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;
import com.springcore.ref.B;

public class RefDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		A aObj = (A) context.getBean("a2ref");
		B bObj = (B) context.getBean("bref");
		
		System.out.println(aObj);
		System.out.println(bObj);
	}

}
