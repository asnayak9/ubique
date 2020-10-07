package com.abhishek.ubique_interview.question.three;

public class QuadraticEquation {
	
	public static Roots findRoots(double a, double b, double c) {
		double rt1 = 0, rt2 = 0;
		double result = (b * b) - (4 * a * c);
		double sqrt = Math.sqrt(result);

		if (result > 0) {
			rt2 = (-b + sqrt) / (2 * a);
			rt1 = (-b - sqrt) / (2 * a);
			return new Roots(rt2, rt1);
		}

		return new Roots((-b + sqrt) / (2 * a), 0);
	}

	public static void main(String[] args) {
		Roots roots = QuadraticEquation.findRoots(2, 10, 8);
		System.out.println("Roots: " + roots.getRt1() + ", " + roots.getRt2());
	}

}
