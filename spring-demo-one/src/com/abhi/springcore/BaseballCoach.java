package com.abhi.springcore;

public class BaseballCoach implements Coach {
	// define a private feild for the dependency
	private FortuneService fortuneService;
	// define a constructor

	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
//use my FortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
