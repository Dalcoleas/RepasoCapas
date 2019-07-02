package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Importancia;
import com.uca.capas.service.ImportanciaService;

@Controller
public class MainController {
	
	@Autowired
	ImportanciaService importanciaService;
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		List<Importancia> imp = importanciaService.getAll();
		mav.addObject("message", "Agregando Contribuyentes :)");
		mav.addObject("importancia", imp);
		mav.setViewName("main");
		return mav;
	}

}
