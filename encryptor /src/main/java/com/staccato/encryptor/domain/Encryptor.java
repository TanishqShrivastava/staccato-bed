package com.staccato.encryptor.domain;

import javax.crypto.SecretKey;

public class Encryptor {
	private SecretKey symmetrickey;
	private byte[] initializationVector;
	public Encryptor(SecretKey symmetrickey, byte[] initializationVector) {
		super();
		this.symmetrickey = symmetrickey;
		this.initializationVector = initializationVector;
	}
	public SecretKey getSymmetrickey() {
		return symmetrickey;
	}
	public void setSymmetrickey(SecretKey symmetrickey) {
		this.symmetrickey = symmetrickey;
	}
	public byte[] getInitializationVector() {
		return initializationVector;
	}
	public void setInitializationVector(byte[] initializationVector) {
		this.initializationVector = initializationVector;
	}
	
	
}
