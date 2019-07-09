package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Importancia;
import com.uca.capas.repositories.ImportanciaRepository;


@Service
public class ImportanciaServiceImpl implements ImportanciaService{
		
	@Autowired
	ImportanciaRepository importanciaRepository;
	
	public List<Importancia> getAll() {
		
		return importanciaRepository.findAll();
	}

	public Importancia findOne(Integer id) {
		// TODO Auto-generated method stub
		return importanciaRepository.findById(id).get();
	}

}
