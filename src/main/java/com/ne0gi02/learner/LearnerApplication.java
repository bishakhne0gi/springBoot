package com.ne0gi02.learner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnerApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LearnerApplication.class, args);

		// MyFirstClass myFirstClass = new MyFirstClass(); same working as below line
		MyFirstClass myFirstClass = context.getBean(MyFirstClass.class);// using context to get the bean
		System.out.println(myFirstClass.sayHello());
	}

	@Bean
	public MyFirstClass myFirstClass() {
		return new MyFirstClass();
	}

}