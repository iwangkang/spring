package me.wk.rabbit.ampq.config;

import org.springframework.amqp.core.ReceiveAndReplyCallback;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
//@EnableScheduling
public class ReceiveConfiguration extends RabbitConfig {
	
	@RabbitListener(queues = QUEUE_NAME)
	public void messageHandler(Object message){
		System.out.println("Received: " + message.toString());
	}
	
//	@Scheduled(fixedDelay = 1)
//	public void receiveAndReply() {
//		lock.lock();
//		try{
//			this.rabbitTemplate().receiveAndReply(QUEUE_NAME, (ReceiveAndReplyCallback<Object, Object>) message -> {
//				System.out.println(message);
//				return "hello ok";
//			});
//		} finally {
//			lock.unlock();
//		}
//	}

}
