package com.apiteste.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apiteste.crm.model.Usuarios;
import com.apiteste.crm.repository.UsuarioRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

	
	@Autowired
	private UsuarioRepository userRepo;
	
	
	@GetMapping
	public List<Usuarios> listar() {
		return userRepo.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuarios adicionar( @RequestBody Usuarios user) {
		return userRepo.save(user);
		
		
		
	}

}
