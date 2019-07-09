package com.uca.capas.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.domain.Importancia;
import com.uca.capas.repositories.ImportanciaRepository;
import com.uca.capas.service.ContribuyenteService;
import com.uca.capas.service.ImportanciaService;

@Controller
public class MainController {
	
	@Autowired
	ImportanciaService importanciaService;
	
	@Autowired
	ContribuyenteService contribuyenteService;
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		List<Importancia> imp = importanciaService.getAll();
		mav.addObject("message", "Agregando Contribuyentes :)");
		mav.addObject("importancia", imp);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView something(@RequestParam(name="nombre") String nombre, @RequestParam(name="apellido") String apellido, 
		@RequestParam(name="nit") String nit, @RequestParam(name="importancia") Integer importancia) {
		ModelAndView mav = new ModelAndView();
		contribuyenteService.insert(nombre, apellido, nit, importancia);
		mav.setViewName("redirect:/");
		return mav;
	}
	
	@RequestMapping("/verContribuyentes")
	public ModelAndView cont() {
		ModelAndView mav = new ModelAndView();
		List<Contribuyente> conti = null;
		List<Importancia> imp = null;
		imp = importanciaService.getAll();
		conti = contribuyenteService.getAll();
		mav.addObject("conti", conti);
		mav.addObject("imp", imp);
		mav.setViewName("cont");
		return mav;
	}

}
