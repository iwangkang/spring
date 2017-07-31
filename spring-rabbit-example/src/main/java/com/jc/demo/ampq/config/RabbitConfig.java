package com.jc.demo.ampq.config;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
	
	protected final String QUEUE_NAME = "spring.rabbit.queue";
	protected static Lock lock = new ReentrantLock();
	
	@Bean
	public ConnectionFactory connectionFactory(){
		CachingConnectionFactory factory = new CachingConnectionFactory();
		factory.setHost("127.0.0.1");
		factory.setUsername("jc");
		factory.setPassword("jc");
		factory.setVirtualHost("jc");
		return factory;
	}
	
	@Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(connectionFactory());
    }
	
	@Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setRoutingKey(QUEUE_NAME);
        template.setQueue(this.QUEUE_NAME);
        return template;
    }
	
	@Bean
	// Every queue is bound to the default direct exchange
	public Queue myQueue() {
	   return new Queue(this.QUEUE_NAME);
	}
}
