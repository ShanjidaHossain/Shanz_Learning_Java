package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.security.auth.Subject;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DemoSpringBootApplication.class, args);
		ApplicationContext ap = new AnnotationConfigApplicationContext(ConfigClass.class);
		SubjectService p = ap.getBean(SubjectService.class);
		System.out.println(p.getSubName());
	}

}
