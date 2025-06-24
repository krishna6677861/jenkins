package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	@GetMapping(value="/get")
	public String get() {
		return "Hello World";
	}
	@GetMapping(value="/getvalue")
	public String getValue() {
		return "Hello";
	}
	@GetMapping(value="/getname")
	public String getName() {
		return "Radhakrishnan";
	}
	@GetMapping(value="/getage")
	public int getAge() {
		return 21;
	}
	
	@GetMapping(value="/getname")
	public String getname() {
		return "Radhakrishnan";
	}
	
	@GetMapping(value="/getage1")
	public int getAge1() {
		return 21;
	}

}
