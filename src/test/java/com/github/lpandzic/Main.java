package com.github.lpandzic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.IOException;

@SpringBootApplication
public class Main {

	public static void main(String[] args) throws IOException {

		new SpringApplicationBuilder(Main.class).run(args);
	}
}
