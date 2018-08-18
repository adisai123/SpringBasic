package com.luv2code.springDomo.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springDomo.Coach;

@Component
// @Scope("prototype")
public class TestBean implements Coach {

	// higher priority
	// @Autowired
	// @Qualifier("randomFortuneServices")
	private FortuneService fortuneService;

	@Value("${foo.emailAddress}")
	private String emailAddress;

	@Value("${foo.team}")
	private String team;

	// @Autowired
	// public TestBean(@Qualifier("happyFortuneService") FortuneService
	// fortuneService) {
	// this.fortuneService = fortuneService;
	// }

	@Override
	public String getDailyWorkOut() {
		return "getDailyWorkOut";
	}

	public TestBean(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// @Autowired
	// public void settttFortuneService(FortuneService fortuneService) {
	// this.fortuneService = fortuneService;
	// }
	//
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	@Override
	public String getEmailAddress() {
		return this.emailAddress;
	}

	@Override
	public String getTeam() {
		return this.team;
	}

	@PostConstruct
	public void init() {
		System.out.println("initTest");
	}

	@PreDestroy
	public void destory() {
		System.out.println("destory");
	}

}
