package com.abhishek.ubique_interview.question.five;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ FakeThermometer.class, WeatherForecastService.class })
public class Config {

	@Bean
	public TemperatureMeasurementCallback callback() {
		return (temperature) -> System.out.println(temperature);
	}

}
