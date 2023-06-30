package com.evertonogura.trabalhandocomdados.service;

import java.util.List;

import com.evertonogura.trabalhandocomdados.model.RequestModel;
import com.evertonogura.trabalhandocomdados.model.ResponseModel;

public interface DataService {
	
	ResponseModel incluir(RequestModel novaComida);
	
	List<ResponseModel> listar();
	
	ResponseModel consultarItem(Long id);
	
}
