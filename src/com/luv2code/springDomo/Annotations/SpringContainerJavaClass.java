package com.luv2code.springDomo.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springDomo.Annotations")
@PropertySource("classpath:sport.properties")
public class SpringContainerJavaClass {
	
	@Bean
	public FortuneService happyFortunateService() {
		return new HappyFortuneService();
	}

	@Bean
	public TestBean myTestBean() {
		
		return new TestBean(happyFortunateService());
	}
}
