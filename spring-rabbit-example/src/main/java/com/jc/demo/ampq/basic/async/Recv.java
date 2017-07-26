package com.jc.demo.ampq.basic.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Recv {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(ReceiveConfiguration.class);
		System.out.println("Start receiving message...");
	}

}
