package com.evertonogura.trabalhandocomdados.service.impl;

import java.util.List;
import java.util.ArrayList;

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

	@Override
	public List<ResponseModel> listar() {
		List<ResponseModel> response = new ArrayList<ResponseModel>();
		
		List<Comida> comidas = databaseRepository.findAll();
		
		for(Comida comida : comidas)
		{
			response.add(new ResponseModel(comida.getId(), comida.getDescricao(), comida.getQuantidade(), ""));
		}
		
		return response;
	}
	
	@Override
	public ResponseModel listar(Long id) {
		Comida entidade = databaseRepository.findById(id).get();
		return new ResponseModel(entidade.getId(), entidade.getDescricao(), entidade.getQuantidade(), "");
	}
	
	private Comida requestToEntity(RequestModel novaComida) {
		return new Comida(novaComida.getDescricao(), novaComida.getQuantidade());
	}

}
