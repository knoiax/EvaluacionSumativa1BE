package com.everis.evaluacion1.Raul.Farias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String inicio() {
		return "index.jsp";
	}
	@RequestMapping("/usuarios")
	public String usuarios() {
		return "usuarios.jsp";
	}
	@RequestMapping("/productos")
	public String productos() {
		return "productos.jsp";
	}
	@RequestMapping("/ventas")
	public String ventas() {
		return "ventas.jsp";
	}	
}
