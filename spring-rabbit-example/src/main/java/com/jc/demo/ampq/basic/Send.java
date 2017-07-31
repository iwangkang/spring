package com.jc.demo.ampq.basic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jc.demo.ampq.config.RabbitConfig;

public class Send {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RabbitConfig.class);
		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
		amqpTemplate.convertAndSend("Hello World");
		System.out.println("Sent: Hello World");
		System.exit(-1);
	}
	
}
