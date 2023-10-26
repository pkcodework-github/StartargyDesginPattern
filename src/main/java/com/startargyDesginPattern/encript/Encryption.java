package com.startargyDesginPattern.encript;

import com.startargyDesginPattern.enums.EncodingPatternEnum;

public interface Encryption {

	public void encrypt(String tobeEncrypted);
	
	public EncodingPatternEnum getEncryptiontype();
}
