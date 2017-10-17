package me.wk.rabbit.ampq.basic.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.wk.rabbit.ampq.config.ReceiveConfiguration;

public class Recv {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(ReceiveConfiguration.class);
		System.out.println("Start receiving message...");
	}

}
