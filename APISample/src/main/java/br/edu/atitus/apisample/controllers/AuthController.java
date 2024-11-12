package br.edu.atitus.apisample.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.apisample.dtos.SignupDTO;
import br.edu.atitus.apisample.entities.TypeUser;
import br.edu.atitus.apisample.entities.UserEntity;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@PostMapping("/signup")
	public ResponseEntity<UserEntity> createNewUser(
			@RequestBody SignupDTO signup){
		// converter DTO2Entity
		UserEntity newUser = new UserEntity();
		BeanUtils.copyProperties(signup, newUser);
		newUser.setType(TypeUser.Common);
		
		// TODO invocar método camada service
		// TODO retornar entidade User
		return ResponseEntity.ok(newUser);
	}

}
