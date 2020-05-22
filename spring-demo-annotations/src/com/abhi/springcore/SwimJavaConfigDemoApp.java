package com.abhi.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring java configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call the methods
		System.out.println(theCoach.getDailyFortune());
		// call our new swim coach methods...has properties file Injected
		System.out.println("Email::"+theCoach.getEmail());
		System.out.println("Team::"+theCoach.getTeam());
		

		// close the context
		context.close();
	}

}
