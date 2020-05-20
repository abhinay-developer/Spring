package com.abhi.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*
 * @Scope("prototype")//create new instance for every time
 */

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;// Feild Injection

	// define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach:: Inside Default Constructor");
	}

	// define my init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("TennisCoach.doMyStartUpStuff()::InitMethod");

	}
	// define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("TennisCoach.doMyCleanUpStuff()::DestroyMethod");

	}
	

	// define a setter method
	/*
	 * @Autowired//setter Injection public void setFortuneService(FortuneService
	 * fortuneService) { System.out.println("TennisCoach::setFortuneService()");
	 * this.fortuneService = fortuneService; }
	 */
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	@Override
	public String getDailyWorkout() {
		return "Practice Your Backhand Volly";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
