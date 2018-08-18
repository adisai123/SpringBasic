package com.luv2code.springDomo.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("annotationsApplocationContext.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringContainerJavaClass.class);
		TestBean testBean = ctx.getBean("myTestBean", TestBean.class);
		System.out.println(testBean.getDailyFortune());
		System.out.println(testBean.getEmailAddress());
		System.out.println(testBean.getTeam());
	}

}
