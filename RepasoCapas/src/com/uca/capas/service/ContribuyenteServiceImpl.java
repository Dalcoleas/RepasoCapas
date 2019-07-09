package com.uca.capas.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

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

	@Transactional
	public int insert(String nombre, String apellido, String nit, Integer codigo) {
		return contribuyenteRepository.insert(nombre, apellido, nit, codigo);
	}

	public Contribuyente save(Contribuyente c) {
		return contribuyenteRepository.save(c);
	}

}
