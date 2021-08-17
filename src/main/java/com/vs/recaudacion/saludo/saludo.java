package com.vs.recaudacion.saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/saludos")

public class saludo {
	
	
	@GetMapping("/")
	public String hello() {
		
		String hola = "hola, es un gusto saludarte ";
		
		
		
		return "<h1>"+ hola+"</h1>";
	}
	
	@GetMapping("/saludo/{nombre}")
	String saludo( @PathVariable String nombre) {
		
		String hola = "hola, es un gusto saludarte "+nombre;
		
		
		
		return hola;
	}
	

	
	@GetMapping("/suma/{n1}/{n2}")
	String suma( @PathVariable int n1, int n2) {
		
		int suma = n1+n2;
		
		String respuesta = "El total de la suma es :"+suma;
		
		
		
		return respuesta;
	}
	
}
	


