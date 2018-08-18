package com.luv2code.springDomo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		super();
		System.out.println("CricketCoach constructor");
		//this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Cricket workout";
	}

	public void setFortuneService(FortuneService theFortuneService) {

		this.fortuneService = theFortuneService;

	}

	@Override
	public String getDailyFortune() {
		
		return this.fortuneService.getFortune();
	}

}
