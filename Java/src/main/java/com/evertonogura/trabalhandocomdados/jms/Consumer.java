package com.evertonogura.trabalhandocomdados.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.evertonogura.trabalhandocomdados.model.JmsModel;

@Component
public class Consumer {
	
	@JmsListener(destination = "MinhaFila", containerFactory = "myFactory")
	public void receberMensagem(JmsModel model) {
		System.out.print("Recebida a seguinte mensagem: <" + model + ">");
	}
	
}
