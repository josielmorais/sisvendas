package com.sisvendas.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisvendas.demo.domain.Cliente;
import com.sisvendas.demo.repositories.ClienteRepository;
import com.sisvendas.demo.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		Cliente obj = repo.getOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
			+ ", Tipo: " + Cliente.class.getName());
			}
		return obj;
	}
	
	

}
