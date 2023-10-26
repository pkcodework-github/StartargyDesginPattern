package com.startargyDesginPattern.encript;

import org.springframework.stereotype.Service;

import com.startargyDesginPattern.enums.EncodingPatternEnum;

@Service
public class SHA1Encryption implements Encryption {

	@Override
	public void encrypt(String tobeEncrypted) {
		System.out.println("I am encrypting using SHA1 encryption method");
	}

	@Override
	public EncodingPatternEnum getEncryptiontype() {
		return EncodingPatternEnum.SHA1;
	}

}
