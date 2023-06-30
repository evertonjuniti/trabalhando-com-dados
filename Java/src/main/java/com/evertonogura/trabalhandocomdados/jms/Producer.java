package com.evertonogura.trabalhandocomdados.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.evertonogura.trabalhandocomdados.model.JmsModel;

@Component
public class Producer {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("MinhaFila")
	private String destino;
	
	public void enviar(JmsModel mensagem) {
		jmsTemplate.convertAndSend(destino, mensagem);
	}
	
}
