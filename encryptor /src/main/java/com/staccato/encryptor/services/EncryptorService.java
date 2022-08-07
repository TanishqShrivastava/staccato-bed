package com.staccato.encryptor.services;

import javax.crypto.SecretKey;

import org.bouncycastle.operator.SymmetricKeyUnwrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.staccato.encryptor.domain.Encryptor;
import com.staccato.encryptor.utility.KeyEncryptor;

public class EncryptorService {
	@Autowired
	KeyEncryptor encryptor;
	

	Encryptor enc= new Encryptor(encryptor.createAESKey(), encryptor.createInitializationVector()); 
	
	public ResponseEntity<?> passwordEncryptor(String password) throws Exception {
		byte[] cipherText
	    = encryptor.do_AESEncryption(
	        password,
	        enc.getSymmetrickey(),
	        enc.getInitializationVector();		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	public ResponseEntity<?> passwordDecryptor(byte[] cipherText) throws Exception {
		String decryptedText
			= encryptor.do_AESDecryption(
					cipherText,
			        enc.getSymmetrickey(),
			        enc.getInitializationVector());		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
