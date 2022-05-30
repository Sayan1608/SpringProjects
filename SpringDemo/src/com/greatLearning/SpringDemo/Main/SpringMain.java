package com.greatLearning.SpringDemo.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatLearning.SpringDemo.SportsCoach;

public class SpringMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//		SportsCoach spCoach = ctx.getBean(SportsCoach.class);
//		SportsCoach spCoach = (SportsCoach) ctx.getBean("cricketCoach");

		System.out.println("--------------------The Cricket Coach-------------------------");
		SportsCoach spCoach = ctx.getBean("cricketCoach", SportsCoach.class);

		System.out.println("The timing is : " + spCoach.getSchedule());
		System.out.println("Advice : " + spCoach.getAdvice());
		
		
		System.out.println("--------------------The Football Coach-------------------------");
		spCoach = ctx.getBean("footballCoach", SportsCoach.class);

		System.out.println("The timing is : " + spCoach.getSchedule());
		System.out.println("Advice : " + spCoach.getAdvice());
		
		ctx.close();
	}

}
