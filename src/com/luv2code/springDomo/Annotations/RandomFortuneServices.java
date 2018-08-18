package com.luv2code.springDomo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServices implements FortuneService {

	@Override
	public String getFortune() {
		return "asdasdsss";
	}

}
