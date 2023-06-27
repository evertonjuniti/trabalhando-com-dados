package com.evertonogura.trabalhandocomdados.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evertonogura.trabalhandocomdados.entity.Comida;
import com.evertonogura.trabalhandocomdados.model.RequestModel;
import com.evertonogura.trabalhandocomdados.model.ResponseModel;
import com.evertonogura.trabalhandocomdados.repository.ComidaRepository;
import com.evertonogura.trabalhandocomdados.service.DataService;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private ComidaRepository databaseRepository;
	
	@Override
	public ResponseModel incluir(RequestModel novaComida) {
		Comida novaEntidade = databaseRepository.save(requestToEntity(novaComida));
		return new ResponseModel(novaEntidade.getId(), novaEntidade.getDescricao(), novaEntidade.getQuantidade(), "");
	}
	
	private Comida requestToEntity(RequestModel novaComida) {
		return new Comida(novaComida.getDescricao(), novaComida.getQuantidade());
	}
		
}
