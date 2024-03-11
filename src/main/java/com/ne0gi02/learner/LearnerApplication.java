package com.ne0gi02.learner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnerApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LearnerApplication.class, args);

		// MyFirstClass myFirstClass = new MyFirstClass(); same working as below line
		MyFirstClass myFirstClass = context.getBean("myBean", MyFirstClass.class);// using context to get the bean
		System.out.println(myFirstClass.sayHello());

		MyFirstService myFirstService = context.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());

		System.out.println(myFirstService.getJavaVersion());
		System.out.println(myFirstService.getOSName());
		System.out.println(myFirstService.getcustomProperty());

		System.out.println(myFirstService.getCustomPropertyFromAnotherFile());

	}

}