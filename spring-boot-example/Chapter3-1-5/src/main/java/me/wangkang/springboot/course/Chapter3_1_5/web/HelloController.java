package me.wangkang.springboot.course.Chapter3_1_5.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class HelloController {

	@ApiIgnore
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index() {
		return "Hello World";
	}

}