package com.staccato.encryptor.utility;
// Java program to implement the
// encryption and decryption

import java.security.SecureRandom;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec
	.IvParameterSpec;

import org.springframework.beans.factory.annotation.Autowired;
//import javax.xml.bind
//	.DatatypeConverter;

public class KeyEncryptor {
	
		@Autowired
		KeyConstants keyObj;
	
		public  byte[] do_AESEncryption(
			String plainText,
			SecretKey secretKey,
			byte[] initializationVector)
			throws Exception
		{
			Cipher cipher
				= Cipher.getInstance(
					);

			IvParameterSpec ivParameterSpec
				= new IvParameterSpec(
					initializationVector);

			cipher.init(Cipher.ENCRYPT_MODE,
						secretKey,
						ivParameterSpec);

			return cipher.doFinal(
				plainText.getBytes());
		}
		
	}
