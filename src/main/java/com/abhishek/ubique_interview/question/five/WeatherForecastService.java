package com.abhishek.ubique_interview.question.five;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class WeatherForecastService {

	@Autowired
	private Thermometer thermometer;
	
	@Autowired
	private TemperatureMeasurementCallback callback;

	@Scheduled(cron = "50 * * * * *")
	public void takeTemperatureMeasurement() {
		int temperature = thermometer.measure();
		callback.temperatureMeasured(temperature);
	}

}