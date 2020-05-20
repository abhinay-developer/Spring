package com.abhi.springcore;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return " Today is Your Lucky day";
	}

}
