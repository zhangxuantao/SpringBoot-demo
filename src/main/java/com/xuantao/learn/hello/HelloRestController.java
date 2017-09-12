package com.xuantao.learn.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hello, springBoot!";
	}
	
}
