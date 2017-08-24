package me.wk.rabbit.ampq.basic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.wk.rabbit.ampq.config.RabbitConfig;

public class Recv {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RabbitConfig.class);
		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
		System.out.println("Received: " + amqpTemplate.receiveAndConvert());
		System.exit(-1);
	}
	
}
