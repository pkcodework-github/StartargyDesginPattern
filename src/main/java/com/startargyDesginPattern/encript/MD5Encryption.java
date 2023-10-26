package com.startargyDesginPattern.encript;

import org.springframework.stereotype.Service;

import com.startargyDesginPattern.enums.EncodingPatternEnum;

@Service
public class MD5Encryption implements Encryption {

	@Override
	public void encrypt(String tobeEncrypted) {
		System.out.println("I am encrypting using MD5 encryption method");

	}

	@Override
	public EncodingPatternEnum getEncryptiontype() {
		return EncodingPatternEnum.MD5;
	}

}
