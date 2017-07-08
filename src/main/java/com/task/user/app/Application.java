package com.task.user.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author laxman
 *
 */
@SpringBootApplication
@ComponentScan("com.task.user")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
