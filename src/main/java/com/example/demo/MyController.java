package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class MyController {

	@GetMapping
	String hello() {
		return "Hello";
	}

}
