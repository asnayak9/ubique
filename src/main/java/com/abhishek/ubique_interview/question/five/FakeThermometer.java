package com.abhishek.ubique_interview.question.five;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class FakeThermometer implements Thermometer {
	private int currentTemperature = 21;

	@Override
	public int measure() {
		return currentTemperature++;
	}

}
