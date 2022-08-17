package org.generation.app.security;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	
	//Método para crear el tokenJWT y enviarlo al cliente
	// en header de respuesta
	
	//Método para crear el tokenJWT y enviarlo al cliente en el header de la respuesta
		static void addAuthentication(HttpServletResponse response, String username) {
			
			String token = Jwts.builder()
					.setSubject(username)
					//Agregamos un tiempo de expiración de 5 minutos
					.setExpiration(new Date(System.currentTimeMillis()+300000))
					.signWith(SignatureAlgorithm.HS512, "jokei")
					.compact();
			
			//agregamos en el encabezado el token
			response.addHeader("Authorization", "Bearer " + token);

		
	}


}
