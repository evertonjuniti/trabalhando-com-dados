package com.evertonogura.trabalhandocomdados.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evertonogura.trabalhandocomdados.model.RequestModel;
import com.evertonogura.trabalhandocomdados.model.ResponseModel;
import com.evertonogura.trabalhandocomdados.repository.DatabaseRepository;
import com.evertonogura.trabalhandocomdados.service.DataService;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private DatabaseRepository databaseRepository;
	
	@Override
	public ResponseModel addData(RequestModel newFood) {
		// TODO Auto-generated method stub
		return null;
	}

}
