package com.evertonogura.trabalhandocomdados.service;

import com.evertonogura.trabalhandocomdados.model.RequestModel;
import com.evertonogura.trabalhandocomdados.model.ResponseModel;

public interface DataService {
	
	ResponseModel addData(RequestModel newFood);
	
}
