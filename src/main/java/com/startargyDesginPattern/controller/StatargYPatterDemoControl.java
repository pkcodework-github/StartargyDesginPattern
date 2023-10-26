package com.startargyDesginPattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.startargyDesginPattern.enums.EncodingPatternEnum;
import com.startargyDesginPattern.factroy.EncryptionFactory;

@RestController
public class StatargYPatterDemoControl {
	
	@Autowired
	EncryptionFactory factroy;

	@GetMapping("/encrypt")
	public void encryptWithEncoder(@RequestParam EncodingPatternEnum encodingPatternEnum) {
		factroy.findEncryptionType(encodingPatternEnum).encrypt("Code Decode");
	}
	
	
	@GetMapping("/testendPoint")
	public void getTestEndpoint() {
		System.out.println("in the control class, pass value is : ");
	}
}
