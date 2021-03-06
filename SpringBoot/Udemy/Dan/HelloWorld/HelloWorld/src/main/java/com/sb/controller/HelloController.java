package com.sb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "hello/{name}")
	private String sayHello(@PathVariable("name") String name) {
		return "Hey ..."+ name +" , Welcome to SpringBoot..!!";
	}
}
