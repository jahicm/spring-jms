package com.jms.boot.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
	
	
	@JmsListener(destination="${spring.jms.myqueue}")
	public void receiveMessage(String message)
	{
		System.out.println("Received message ==>"+message);
	}
}
