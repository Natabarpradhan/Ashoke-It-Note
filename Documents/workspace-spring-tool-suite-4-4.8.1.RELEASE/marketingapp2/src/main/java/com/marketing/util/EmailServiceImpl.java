package com.marketing.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService{
  
	@Autowired 
	JavaMailSender javaMailSender;
	
  @Override
	public void sendEmail(String to, String sub, String msg) {
			SimpleMailMessage message=new SimpleMailMessage();
			message.setTo(to);
			message.setSubject(sub);
			message.setText(msg);
			
			javaMailSender.send(message);
			
	}

}
