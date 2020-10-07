package com.abhishek.ubique_interview.question.four;

public class Movie {

	public String name;
	public int year;
	public int rating;
	
	public Movie(String name, int year, int rating) {
		super();
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [name=");
		builder.append(name);
		builder.append(", year=");
		builder.append(year);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	
}
