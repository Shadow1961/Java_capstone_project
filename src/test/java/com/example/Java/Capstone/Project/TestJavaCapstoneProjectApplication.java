package com.example.Java.Capstone.Project;

import org.springframework.boot.SpringApplication;

public class TestJavaCapstoneProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(JavaCapstoneProjectApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
