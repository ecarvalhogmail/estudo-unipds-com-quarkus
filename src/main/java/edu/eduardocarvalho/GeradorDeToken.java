package edu.eduardocarvalho;

import io.smallrye.jwt.build.Jwt;
import org.eclipse.microprofile.jwt.Claims;

import java.util.Arrays;
import java.util.HashSet;

public class GeradorDeToken{
	//token=$(curl https://raw.githubusercontent.com/eldermoraes/unipds/main/jwt-token/quarkus.jwt.token -s)

	//curl -v -w '\n' -H "Authorization: Bearer $token" localhost:8080/secure/claim

	//--------------------------
	public static void main(String[] args) {
		String token = Jwt.issuer("https://example.com/issuer")
				 .upn("jdoe@quarkus.io")
				 .groups(new HashSet<>(Arrays.asList("User", "Admin")))
				 .claim(Claims.birthdate.name(), "2001-07-13")
				 .sign();
				 
		System.out.println(token);
		System.exit(0);
	}
	
}

