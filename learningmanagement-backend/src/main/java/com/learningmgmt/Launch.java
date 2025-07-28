package com.learningmgmt;

import java.util.Base64;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Jwts;

public class Launch {

	public static void main(String[] args) {
		
		SecretKey key =Jwts.SIG.HS512.key().build();
		String encodedToString =Base64.getEncoder().encodeToString(key.getEncoded());
		System.out.println(encodedToString);
	}
}
