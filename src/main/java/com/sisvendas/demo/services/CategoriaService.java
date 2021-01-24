package com.sisvendas.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisvendas.demo.domain.Categoria;
import com.sisvendas.demo.repositories.CategoriaRepository;
import com.sisvendas.demo.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		
		Categoria obj = repo.getOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
			+ ", Tipo: " + Categoria.class.getName());
			}
		return obj;
	}
	
	
	public Categoria insert(Categoria obj) {
		return obj =repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return obj =repo.save(obj);
	}
	

}
