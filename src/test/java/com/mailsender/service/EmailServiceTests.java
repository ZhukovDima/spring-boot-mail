package com.mailsender.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailServiceTests {

	@Autowired
	private EmailService emailService;

	@Test
	public void testEmail(){
		emailService.sendMail("zhukovdima@list.ru","Test subject","Test mail");
	}
}
