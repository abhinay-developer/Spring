package com.abhi.springcore;

public class MyApp {

	public static void main(String[] args) {
        //create the object
		 Coach theCoach = new TrackCoach();//generic interface

		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}//main

}//class
