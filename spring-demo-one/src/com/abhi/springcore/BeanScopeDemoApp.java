package com.abhi.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
    //load the Spring configuration file
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
            //check if they are the same
		boolean result=(theCoach==alphaCoach);
		//printout the result
		System.out.println("\n Pointing to the same object::"+result);
		System.out.println("\nMemory Location for theCoach::"+theCoach);
		System.out.println("\nMemory Location for theCoach::"+alphaCoach);
		//close the context
		context.close();
		
	}

}
