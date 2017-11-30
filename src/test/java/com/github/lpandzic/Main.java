package com.github.lpandzic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@EnableJpaRepositories
@SpringBootApplication
public class Main {

	public static void main(String[] args) throws IOException {

		new SpringApplicationBuilder(Main.class).run(args);
	}
}
