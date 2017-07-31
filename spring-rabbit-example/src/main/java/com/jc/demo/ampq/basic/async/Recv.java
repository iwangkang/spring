package com.jc.demo.ampq.basic.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jc.demo.ampq.config.ReceiveConfiguration;

public class Recv {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(ReceiveConfiguration.class);
		System.out.println("Start receiving message...");
	}

}
