package com.abhishek.ubique_interview.question.three;

public class Roots {

	private double rt1;
	
	private double rt2;

	public Roots(double rt1, double rt2) {
		super();
		this.rt1 = rt1;
		this.rt2 = rt2;
	}

	public double getRt1() {
		return rt1;
	}

	public void setRt1(double rt1) {
		this.rt1 = rt1;
	}

	public double getRt2() {
		return rt2;
	}

	public void setRt2(double rt2) {
		this.rt2 = rt2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Roots [rt1=");
		builder.append(rt1);
		builder.append(", rt2=");
		builder.append(rt2);
		builder.append("]");
		return builder.toString();
	}
	
}
