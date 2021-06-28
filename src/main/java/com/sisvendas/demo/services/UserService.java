package com.sisvendas.demo.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.sisvendas.demo.security.UserSS;

public class UserService {

	
	//	método que retorna o usuário logado
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
