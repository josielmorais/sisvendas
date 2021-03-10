package com.sisvendas.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.sisvendas.demo.domain.Categoria;
import com.sisvendas.demo.repositories.CategoriaRepository;
import com.sisvendas.demo.services.exceptions.DataIntegrityException;
import com.sisvendas.demo.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);

		//Não entra no metodo( verificar depois)
		if (obj == null || obj.equals(null)) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
			+ ", Tipo: " + Categoria.class.getName());
			}
		return obj.orElse(null);
	}
	
	
	public Categoria insert(Categoria obj) {
		return obj =repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return obj =repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
		repo.deleteById(id);
		}catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir categoria que possui produtos");
			
		}
	}
	
    public List<Categoria> findAll(){
    	return repo.findAll();
    }
}
