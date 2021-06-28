package com.sisvendas.demo.services;

import com.sisvendas.demo.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	//void sendEmail(SimpleMailMessage msg);
}
