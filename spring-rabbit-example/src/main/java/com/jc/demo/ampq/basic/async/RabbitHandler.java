package com.jc.demo.ampq.basic.async;

public class RabbitHandler {

	public void handleMessage(String text) {
		System.out.println("Received: " + text);
	}

}
