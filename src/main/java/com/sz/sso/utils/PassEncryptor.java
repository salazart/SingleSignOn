package com.sz.sso.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PassEncryptor {
	
	private static final String ALGORITM = "MD5";

	public static String encrypt(String password) throws NoSuchAlgorithmException {
			MessageDigest md = MessageDigest.getInstance(ALGORITM);
			md.update(password.getBytes());
			byte[] bytes = md.digest();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			return sb.toString();
	}
}
