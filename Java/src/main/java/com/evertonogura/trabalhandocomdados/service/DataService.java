package com.evertonogura.trabalhandocomdados.service;

import java.util.List;

import com.evertonogura.trabalhandocomdados.model.RequestModelComida;
import com.evertonogura.trabalhandocomdados.model.ResponseModelComida;
import com.evertonogura.trabalhandocomdados.model.ResponseModelTipoComida;

public interface DataService {
	
	List<ResponseModelTipoComida> listarTiposComida();
	
	ResponseModelComida incluirComida(RequestModelComida novaComida);
	
	List<ResponseModelComida> listarComidas();
	
	ResponseModelComida consultarComida(Long id);
	
}
