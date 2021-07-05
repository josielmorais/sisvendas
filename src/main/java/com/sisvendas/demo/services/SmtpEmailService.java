package com.sisvendas.demo.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.sisvendas.demo.domain.Cliente;

public class SmtpEmailService extends AbstractEmailService {

	
	// pega os dados inseridos no aplication-teste.properties(email)
	@Autowired
	private MailSender mailSender;
	
	private  static final Logger LOG = LoggerFactory.getLogger(SmtpEmailService.class);
	
	
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOG.info("Enviando email...");
		mailSender.send(msg);
		LOG.info("Email enviado.");		
	}

	@Override
	public void sendNewPasswordEmail(Cliente cliente, String newPass) {
		// TODO Auto-generated method stub
		
	}

}
