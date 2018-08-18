package com.luv2code.springDomo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// create obj
		Coach theCoach = new TrackOuach();
		// Use the Object
		System.out.println(theCoach.getDailyWorkOut());
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoaches = ctx.getBean("myCoach", Coach.class);
		System.out.println(theCoaches.getDailyWorkOut());
		System.out.println(theCoaches.getDailyFortune());

		Coach cricketCoach = ctx.getBean("myCricketCoach", Coach.class);
//		System.out.println(cricketCoach.getDailyWorkOut());
//		System.out.println(cricketCoach.getDailyFortune());
//		System.out.println(cricketCoach.getEmailAddress());
//		System.out.println(cricketCoach.getTeam());
		
	}

}
