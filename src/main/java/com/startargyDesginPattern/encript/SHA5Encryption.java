package com.startargyDesginPattern.encript;

import org.springframework.stereotype.Service;

import com.startargyDesginPattern.enums.EncodingPatternEnum;

@Service
public class SHA5Encryption implements Encryption {

	@Override
	public void encrypt(String tobeEncrypted) {
		System.out.println("I am encrypting using SHA5 encryption method");
	}

	@Override
	public EncodingPatternEnum getEncryptiontype() {
		return EncodingPatternEnum.SHA5;
	}

}
