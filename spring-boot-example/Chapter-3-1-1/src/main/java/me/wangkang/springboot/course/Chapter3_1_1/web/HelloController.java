package me.wangkang.springboot.course.Chapter3_1_1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello")
	public String hello(){
		return "Hello world!";
	}

}
