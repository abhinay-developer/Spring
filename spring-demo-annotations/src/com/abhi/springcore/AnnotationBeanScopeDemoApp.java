package com.abhi.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		// printout the results
		System.out.println("\n Pointing to same object::" + result);
		System.out.println("\n Memory location for theCoach::" + theCoach);
		System.out.println("\n Memory location for alphaCoach::" + alphaCoach);
	//close the context
		
		context.close();
	}

}
