package com.startargyDesginPattern.factroy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.startargyDesginPattern.encript.Encryption;
import com.startargyDesginPattern.enums.EncodingPatternEnum;

@Component
public class EncryptionFactory {

	Map<EncodingPatternEnum, Encryption> map;
	
	@Autowired
	public EncryptionFactory(Set<Encryption> encryptionTypesSet) {
		createStrategy(encryptionTypesSet);
	}

	private void createStrategy(Set<Encryption> encryptionTypesSet) {
		map = new HashMap<EncodingPatternEnum, Encryption>();
		encryptionTypesSet.stream()
				.forEach(encryptionTypes -> map.put(encryptionTypes.getEncryptiontype(), encryptionTypes));
	}

	public Encryption findEncryptionType(EncodingPatternEnum encodingPatternEnums) {
		return map.get(encodingPatternEnums);
	}
}
