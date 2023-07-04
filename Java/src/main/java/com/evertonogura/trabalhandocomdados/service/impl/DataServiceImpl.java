package com.evertonogura.trabalhandocomdados.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evertonogura.trabalhandocomdados.entity.Comida;
import com.evertonogura.trabalhandocomdados.entity.TipoComida;
import com.evertonogura.trabalhandocomdados.exception.TipoComidaNotFoundException;
import com.evertonogura.trabalhandocomdados.jms.Producer;
import com.evertonogura.trabalhandocomdados.model.JmsModel;
import com.evertonogura.trabalhandocomdados.model.RequestModelComida;
import com.evertonogura.trabalhandocomdados.model.ResponseModelComida;
import com.evertonogura.trabalhandocomdados.model.ResponseModelTipoComida;
import com.evertonogura.trabalhandocomdados.repository.ComidaRepository;
import com.evertonogura.trabalhandocomdados.repository.TipoComidaRepository;
import com.evertonogura.trabalhandocomdados.service.DataService;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private TipoComidaRepository tipoComidaRepository;
	
	@Autowired
	private ComidaRepository comidaRepository;
	
	@Autowired
	private Producer producer;
	
	@Override
	public List<ResponseModelTipoComida> listarTiposComida() {
		List<ResponseModelTipoComida> response = new ArrayList<ResponseModelTipoComida>();
		
		List<TipoComida> tiposComida = tipoComidaRepository.findAll();
		
		for(TipoComida tipoComida : tiposComida)
			response.add(new ResponseModelTipoComida(tipoComida.getId(), tipoComida.getDescricao()));
		
		return response;
	}
	
	@Override
	public ResponseModelComida incluirComida(RequestModelComida novaComida) {
		TipoComida tipoComida = validate(novaComida);
		Comida novaEntidade = comidaRepository.save(requestToEntity(novaComida, tipoComida));
		producer.enviar(entityToMessage(novaEntidade));
		return new ResponseModelComida(novaEntidade.getId(), novaEntidade.getDescricao(), 
				novaEntidade.getQuantidade(), novaEntidade.getTipoComida().getDescricao());
	}

	@Override
	public List<ResponseModelComida> listarComidas() {
		List<ResponseModelComida> response = new ArrayList<ResponseModelComida>();
		
		List<Comida> comidas = comidaRepository.findAll();
		
		for(Comida comida : comidas) {
			response.add(new ResponseModelComida(comida.getId(), comida.getDescricao(), 
					comida.getQuantidade(), comida.getTipoComida().getDescricao()));
		}
		
		return response;
	}
	
	@Override
	public ResponseModelComida consultarComida(Long id) {
		Comida comida = comidaRepository.findById(id).get();
		return new ResponseModelComida(comida.getId(), comida.getDescricao(), 
				comida.getQuantidade(), comida.getTipoComida().getDescricao());
	}
	
	private TipoComida validate(RequestModelComida novaComida) {
		return tipoComidaRepository.findByDescricao(novaComida.getTipoComida())
			.orElseThrow(() -> new TipoComidaNotFoundException(novaComida.getTipoComida()));
	}
	
	private Comida requestToEntity(RequestModelComida novaComida, TipoComida tipoComida) {
		return new Comida(novaComida.getDescricao(), novaComida.getQuantidade(), tipoComida);
	}
	
	private JmsModel entityToMessage(Comida comida) {
		return new JmsModel(comida.getDescricao(), comida.getTipoComida().getDescricao());
	}

}
