package com.luv2code.springDomo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class newApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = ctx.getBean("myCricketCoach", Coach.class);
		System.out.println(coach.hashCode());
		Coach nextCoach = ctx.getBean("myCricketCoach", Coach.class);
		System.out.println(nextCoach.hashCode());
		Coach textCoach = ctx.getBean("myCoach", Coach.class);
		Coach textCoach1 = ctx.getBean("myCoach", Coach.class);
		System.out.println(textCoach == textCoach1);
		System.out.println(textCoach + ":\n" + textCoach1);
		System.out.println(textCoach.hashCode() + ":\n" + textCoach1.hashCode());
		ctx.close();
	}

}
