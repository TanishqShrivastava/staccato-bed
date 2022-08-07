package com.staccato.authenticator.utility;

import java.security.SecureRandom;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class AuthPasswordDecryptor {

	private static final String AES = "AES";

	// We are using a Block cipher(CBC mode)
	private static final String AES_CIPHER_ALGORITHM = "AES/CBC/PKCS5PADDING";

	private static Scanner message;


	public String decrypt(byte[] password) {

		try {
			return do_AESDecryption(password, createAESKey(), createInitializationVector());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String do_AESDecryption(byte[] cipherText, SecretKey secretKey, byte[] initializationVector)
			throws Exception {
		Cipher cipher = Cipher.getInstance(AES_CIPHER_ALGORITHM);

		IvParameterSpec ivParameterSpec = new IvParameterSpec(initializationVector);

		cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);

		byte[] result = cipher.doFinal(cipherText);

		return new String(result);
	}

	public SecretKey createAESKey() throws Exception {
		SecureRandom securerandom = new SecureRandom();
		KeyGenerator keygenerator = KeyGenerator.getInstance(AES);

		keygenerator.init(256, securerandom);
		SecretKey key = keygenerator.generateKey();

		return key;
	}

	// Function to initialize a vector
	// with an arbitrary value
	public byte[] createInitializationVector() {

		// Used with encryption
		byte[] initializationVector = new byte[16];
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.nextBytes(initializationVector);
		return initializationVector;
	}
}
