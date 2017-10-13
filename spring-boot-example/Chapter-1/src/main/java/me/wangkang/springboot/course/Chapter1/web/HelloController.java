package me.wangkang.springboot.course.Chapter1.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET, consumes="application/json", produces="application/json", params="id=a", headers="Referer=http://wangkang.me")
	public String index(String id, String str){
		return "Hello world!";
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello world!";
	}
	
	@RequestMapping(value="/test2/{id}", method=RequestMethod.GET)
	public String test2(@PathVariable String id){
		return "id is " + id;
	}
	
	@RequestMapping(value="/test3/{[^(A-Za-z)]}")
	public String test3(@PathVariable String str) {
		return "str is " + str;
	}
	
}
