package me.wk.rabbit.ampq.config;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;

@Configuration
public class SendConfiguration extends RabbitConfig {

	protected final String QUEUE_NAME = "spring.rabbit.queue";

	@Bean
	public ScheduledProducer scheduledProducer() {
		return new ScheduledProducer();
	}

	@Bean
	public BeanPostProcessor postProcessor() {
		return new ScheduledAnnotationBeanPostProcessor();
	}

	static class ScheduledProducer {

		@Autowired
		private volatile RabbitTemplate rabbitTemplate;

		private final AtomicInteger counter = new AtomicInteger();

		@Scheduled(fixedRate = 3000)
		public void sendMessage() {
			rabbitTemplate.convertAndSend("Hello World " + counter.incrementAndGet());
		}
	}

}
