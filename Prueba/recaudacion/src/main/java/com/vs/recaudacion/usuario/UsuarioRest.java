package com.vs.recaudacion.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.recaudacion.config.exception.BadRequestException;


@RestController
@RequestMapping("v2/usuarios")
public class UsuarioRest {

	@Autowired
	private UsuarioService usuarioService;
	

	
	
	//respuesta basado en codigo 200-500-404 etc.
	//validar con descripciones
	
	@PostMapping("/usuario")
	 Usuario create(@RequestBody Usuario user) {
		
		
		
		boolean respuesta = usuarioService.validarRut(user);

		
		if(respuesta == false ) {
			throw new BadRequestException("Rut invalido ");
		}else {
			return(usuarioService.agregarUsuario(user));
			
		}
		
		
		 
	}
	
	/*@GetMapping("/usuarios")
	public List<Usuario> listar(){
		return usuarioDAO.findAll();
	}
	
	@GetMapping("/rut/{userId}")
	String subirArchivo( @PathVariable Integer userId) {
		Usuario user = usuarioDAO.findById(userId).get();
		
		
		String token = user.getRut();
		/*
		 * 
		 * 
		 * 
		return token;
	}*/

}