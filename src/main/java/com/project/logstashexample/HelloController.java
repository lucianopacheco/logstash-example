package com.project.logstashexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		log.info("This log is inside 'hello' method");
		return "Hello world!";
	}

}
