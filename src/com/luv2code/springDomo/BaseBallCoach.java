package com.luv2code.springDomo;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;

	public BaseBallCoach(FortuneService f) {
		this.fortuneService = f;
		System.out.println(f.getFortune());
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 Minute";
	}

	public FortuneService getFortuneService() {

		return fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
	public void doMyStart() {
		System.out.println("mystartup stuf");
		
	}
	
	public void myCleanup() {
		System.out.println("my clean up");
		
	}
}
