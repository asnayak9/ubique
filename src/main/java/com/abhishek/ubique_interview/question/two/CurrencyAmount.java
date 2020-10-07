package com.abhishek.ubique_interview.question.two;

public class CurrencyAmount {

	private String currency;
	private double amount;

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setAmount(String amount) {
		this.amount = Double.valueOf(amount);
	}

	public double getAmount() {
		return this.amount;
	}

}
