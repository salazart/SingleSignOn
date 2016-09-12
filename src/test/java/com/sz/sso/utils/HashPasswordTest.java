package com.sz.sso.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.security.NoSuchAlgorithmException;

import org.junit.Test;

public class HashPasswordTest {
	private static final String PASS_EXAMPLE = "password";
	
	@Test
	public void test() {
		String hash = null;
		try {
			hash = PassEncryptor.encrypt(PASS_EXAMPLE);
		} catch (NoSuchAlgorithmException e) {
			hash = null;
		}
		assertNotNull(hash);
		
		assertFalse(hash.isEmpty());
	}

}
