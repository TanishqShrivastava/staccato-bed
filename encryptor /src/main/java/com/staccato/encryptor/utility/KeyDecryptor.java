package com.staccato.encryptor.utility;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class KeyDecryptor {

	public  String do_AESDecryption(
		byte[] cipherText,
		SecretKey secretKey,
		byte[] initializationVector)
		throws Exception
	{
		Cipher cipher
			= Cipher.getInstance(
				AES_CIPHER_ALGORITHM);

		IvParameterSpec ivParameterSpec
			= new IvParameterSpec(
				initializationVector);

		cipher.init(
			Cipher.DECRYPT_MODE,
			secretKey,
			ivParameterSpec);

		byte[] result
			= cipher.doFinal(cipherText);

		return new String(result);
	}

}
