package com.staccato.encryptor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staccato.encryptor.services.EncryptorService;

@RestController
@RequestMapping("/cryptor")
public class EncryptorController {
	
	@Autowired
	EncryptorService service;
	
	@PostMapping("/enc")
	public ResponseEntity<?> passwordEncryptor(
			@RequestHeader HttpHeaders headers,
			@RequestParam String password) throws Exception{
		return service.passwordEncryptor(password);
	}
	@GetMapping("/dec")
	public ResponseEntity<?> passwordDeccryptor(
			@RequestHeader HttpHeaders headers,
			@RequestParam byte[] cipherText) throws Exception{
		return service.passwordDecryptor(cipherText);
	}
}
