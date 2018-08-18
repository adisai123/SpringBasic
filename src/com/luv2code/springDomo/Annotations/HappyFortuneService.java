package com.luv2code.springDomo.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	@Override
	public String getFortune() {
		return "Today is your lucky day!";

	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("predestroy");
	}
}
