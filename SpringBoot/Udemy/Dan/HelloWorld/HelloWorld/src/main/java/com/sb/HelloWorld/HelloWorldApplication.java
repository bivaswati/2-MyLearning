package com.sb.HelloWorld;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.sb.notification.User;

@SpringBootApplication
@ComponentScan({ "com.sb.controller", "com.sb.notification" })
public class HelloWorldApplication {

	@Bean
	public User userBean() {
		return new User("bivas", "dash", "bivas@gmail.com");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloWorldApplication.class, args);

		String beanNames[] = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);

		for (String bean : beanNames) {
			System.out.println(bean);
		}

		System.out.println(ctx.getBean("userBean").toString());
	}
}
