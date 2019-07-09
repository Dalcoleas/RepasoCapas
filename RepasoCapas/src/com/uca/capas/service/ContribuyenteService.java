package com.uca.capas.service;

import java.util.Date;
import java.util.List;

import com.uca.capas.domain.Contribuyente;

public interface ContribuyenteService {
	
	public List<Contribuyente> getAll();
	
	public Contribuyente save(Contribuyente c);
	
	public int insert (String nombre, String apellido, String nit, Integer codigo);
}
