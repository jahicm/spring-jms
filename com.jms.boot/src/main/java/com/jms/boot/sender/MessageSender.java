package com.jms.boot.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${spring.jms.myqueue}")
	String queue;

	public void send(String message) throws InterruptedException {
		for (int i = 0, j = 10; i < j; i++) {
			System.out.println("Sending ==>" + message);
			jmsTemplate.convertAndSend(queue, message);
			Thread.sleep(2000);
		}
	}

}
