package com.staccato.authenticator.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.staccato.authenticator.dao.AuthRepository;
import com.staccato.authenticator.domain.AuthUserModel;
import com.staccato.authenticator.utility.AuthPasswordDecryptor;

public class AuthService {
	
	@Autowired
	AuthPasswordDecryptor decryptor;
	
	@Autowired
	AuthRepository repo;
	
	public ResponseEntity<?> addUser(String mail, byte[] password) {
		String decryptedPassword=decryptor.decrypt(password);
		Optional<AuthUserModel> userOptional;
		AuthUserModel user=new AuthUserModel();
		user.setUserId(decryptedPassword);
		user.setUsermail(mail);
		repo.save(user);		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
