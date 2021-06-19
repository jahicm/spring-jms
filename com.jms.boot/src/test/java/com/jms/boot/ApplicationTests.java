package com.jms.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jms.boot.sender.MessageSender;

@SpringBootTest
class ApplicationTests {

	@Autowired
	MessageSender messageSender;
	
	@Test
	public void testJMSSender() throws InterruptedException
	{
		messageSender.send("********My First JMS message*******");
	}

}
