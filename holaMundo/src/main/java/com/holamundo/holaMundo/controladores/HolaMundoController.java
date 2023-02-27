package com.holamundo.holaMundo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController{
	
	@GetMapping("/")
	public static String saludo() {
		return "Hola Mundo";
	}
	
	@GetMapping("/{usuario}")
	public static String saludo(@PathVariable String usuario) {
		return "Hola Mundo " + usuario;
	}
}
