package com.staccato.encryptor.utility;

import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyConstants {
	private static final String AES = "AES";

	// We are using a Block cipher(CBC mode)
	private static final String AES_CIPHER_ALGORITHM = "AES/CBC/PKCS5PADDING";
	
	public  SecretKey createAESKey()
			throws Exception
		{
			SecureRandom securerandom
				= new SecureRandom();
			KeyGenerator keygenerator
				= KeyGenerator.getInstance(AES);

			keygenerator.init(256, securerandom);
			SecretKey key
				= keygenerator.generateKey();

			return key;
		}

		// Function to initialize a vector
		// with an arbitrary value
		public  byte[] createInitializationVector()
		{

			// Used with encryption
			byte[] initializationVector
				= new byte[16];
			SecureRandom secureRandom
				= new SecureRandom();
			secureRandom.nextBytes(initializationVector);
			return initializationVector;
		}
}
