package com.abhishek.ubique_interview.question.four;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext();
		config.register(Config.class);
		config.refresh();
		MovieRepository repository = config.getBean(MovieRepository.class);

		repository.createMovie("Some movie", 1974, 3);
		repository.createMovie("Some other movie", 1993, 2);

		List<Movie> movies = repository.findMoviesByName("Some%");
		for (Movie movie : movies) {
			System.out.println(movie.name + " - " + movie.year + " - " + movie.rating);
		}

	}
}
