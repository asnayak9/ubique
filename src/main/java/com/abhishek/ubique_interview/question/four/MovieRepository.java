package com.abhishek.ubique_interview.question.four;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {

	@Autowired
	private JdbcTemplate template;

	@Autowired MovieMapper movieMapper;
	
	@PostConstruct
	public void createTable() {
		template.execute(
				"CREATE TABLE movies (id bigint auto_increment primary key, name VARCHAR(50), year int, rating int)");
	}

	public void createMovie(String name, int year, int rating) {
		template.update("INSERT INTO movies (name, year, rating) VALUES (?, ?, ?)", new Object[] {name, year, rating});
	}

	public List<Movie> findMoviesByName(String likeName) {
		return template.query("select * from movies m where m.name like '%" + likeName + "%'", movieMapper);
	}

}
