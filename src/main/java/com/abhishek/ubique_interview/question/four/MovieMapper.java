package com.abhishek.ubique_interview.question.four;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MovieMapper implements RowMapper<Movie> {

	@Override
	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		Movie m = new Movie(rs.getString("name"), rs.getInt("year"), rs.getInt("rating"));
		return m;
	}

}
