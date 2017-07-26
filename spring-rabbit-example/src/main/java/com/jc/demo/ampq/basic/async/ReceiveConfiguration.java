package com.jc.demo.ampq.basic.async;

import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jc.demo.ampq.basic.RabbitConfig;

@Configuration
public class ReceiveConfiguration extends RabbitConfig {

	@Bean
	public SimpleMessageListenerContainer listenerContainer() {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory());
		container.setQueueNames(this.QUEUE_NAME);
		container.setMessageListener(new MessageListenerAdapter(new RabbitHandler()));
		return container;
	}

}
