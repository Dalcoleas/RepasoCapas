package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.repositories.ContribuyenteRepository;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService{
	
	@Autowired
	ContribuyenteRepository contribuyenteRepository;
	
	public List<Contribuyente> getAll() {
		
		return contribuyenteRepository.findAll();
	}

}
