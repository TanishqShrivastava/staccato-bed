package com.staccato.authenticator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staccato.authenticator.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	AuthService service;
	
	@PostMapping("/add")
	public ResponseEntity<?> addNewUser(
			@RequestHeader HttpHeaders headers,
			@RequestParam String mail,
			@RequestParam byte[] password){
		return service.addUser(mail,password);
	}
	
}
