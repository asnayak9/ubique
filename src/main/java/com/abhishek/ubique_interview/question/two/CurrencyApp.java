package com.abhishek.ubique_interview.question.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static java.util.stream.Collectors.groupingBy;

import java.io.IOException;
import java.io.InputStream;

public class CurrencyApp {

	private static final String JSON_FILE = "currencies.json";
	
	private InputStream in;
	
	private ObjectMapper mapper;
	
	public CurrencyApp() {
		this.mapper = new ObjectMapper();
		ClassLoader cl = getClass().getClassLoader();
		this.in = cl.getResourceAsStream(JSON_FILE);
	}
	
	public static void main(String[] args){
		CurrencyApp app = new CurrencyApp();
		app.printResult();
	}
	
	public void printResult() {
		List<CurrencyAmount> currencies = new ArrayList<>();
		currencies = readJsonFile();
		Map<String, Double> result = currencies.stream().
			collect(groupingBy(CurrencyAmount::getCurrency, Collectors.summingDouble(CurrencyAmount::getAmount)));
			
		System.out.println(result);
	}
	
	public List<CurrencyAmount> readJsonFile(){
		try {
			return mapper.readValue(in, new TypeReference<List<CurrencyAmount>>() {});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Collections.emptyList();
	}
}
