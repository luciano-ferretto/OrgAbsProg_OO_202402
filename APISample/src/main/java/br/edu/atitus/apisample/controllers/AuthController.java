package br.edu.atitus.apisample.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.apisample.dtos.SignupDTO;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@PostMapping("/signup")
	public ResponseEntity<String> createNewUser(
			@RequestBody SignupDTO signup){
		// TODO converter DTO2Entity
		// TODO invocar método camada service
		// TODO retornar entidade User
		return ResponseEntity.ok("Usuário criado: " + signup.getName());
	}

}
