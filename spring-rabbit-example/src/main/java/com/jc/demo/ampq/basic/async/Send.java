package com.jc.demo.ampq.basic.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jc.demo.ampq.config.SendConfiguration;

public class Send {

	public static void main(String[] args) throws Exception {
		new AnnotationConfigApplicationContext(SendConfiguration.class);
		System.out.println("Start sending message...");
	}

}
