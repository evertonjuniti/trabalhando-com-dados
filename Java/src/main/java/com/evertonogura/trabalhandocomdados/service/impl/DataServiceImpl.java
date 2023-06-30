package com.evertonogura.trabalhandocomdados.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evertonogura.trabalhandocomdados.entity.Comida;
import com.evertonogura.trabalhandocomdados.entity.TipoComida;
import com.evertonogura.trabalhandocomdados.exception.TipoComidaNotFoundException;
import com.evertonogura.trabalhandocomdados.model.RequestModel;
import com.evertonogura.trabalhandocomdados.model.ResponseModel;
import com.evertonogura.trabalhandocomdados.repository.ComidaRepository;
import com.evertonogura.trabalhandocomdados.repository.TipoComidaRepository;
import com.evertonogura.trabalhandocomdados.service.DataService;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private ComidaRepository comidaRepository;
	
	@Autowired
	private TipoComidaRepository tipoComidaRepository;
	
	@Override
	public ResponseModel incluir(RequestModel novaComida) {
		TipoComida tipoComida = validate(novaComida);
		Comida novaEntidade = comidaRepository.save(requestToEntity(novaComida, tipoComida));
		return new ResponseModel(novaEntidade.getId(), novaEntidade.getDescricao(), 
				novaEntidade.getQuantidade(), novaEntidade.getTipoComida().getDescricao());
	}

	@Override
	public List<ResponseModel> listar() {
		List<ResponseModel> response = new ArrayList<ResponseModel>();
		
		List<Comida> comidas = comidaRepository.findAll();
		
		for(Comida comida : comidas)
		{
			response.add(new ResponseModel(comida.getId(), comida.getDescricao(), 
					comida.getQuantidade(), comida.getTipoComida().getDescricao()));
		}
		
		return response;
	}
	
	@Override
	public ResponseModel consultarItem(Long id) {
		Comida comida = comidaRepository.findById(id).get();
		return new ResponseModel(comida.getId(), comida.getDescricao(), 
				comida.getQuantidade(), comida.getTipoComida().getDescricao());
	}
	
	private TipoComida validate(RequestModel novaComida) {
		return tipoComidaRepository.findByDescricao(novaComida.getTipoComida())
			.orElseThrow(() -> new TipoComidaNotFoundException(novaComida.getTipoComida()));
	}
	
	private Comida requestToEntity(RequestModel novaComida, TipoComida tipoComida) {
		return new Comida(novaComida.getDescricao(), novaComida.getQuantidade(), tipoComida);
	}

}
