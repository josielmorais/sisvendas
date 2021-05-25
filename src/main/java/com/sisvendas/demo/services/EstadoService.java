package com.sisvendas.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.sisvendas.demo.domain.Estado;
import com.sisvendas.demo.repositories.EstadoRepository;
import com.sisvendas.demo.services.exceptions.DataIntegrityException;
import com.sisvendas.demo.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado find(Integer id) {
		Optional<Estado> obj = repo.findById(id);

		//Não entra no metodo( verificar depois)
		if (obj == null || obj.equals(null)) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
			+ ", Tipo: " + Estado.class.getName());
			}
		return obj.orElse(null);
	}
	
	
	public Estado insert(Estado obj) {
		return obj =repo.save(obj);
	}
	
	public Estado update(Estado obj) {
		find(obj.getId());
		return obj =repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
		repo.deleteById(id);
		}catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir Estado que possui produtos");
			
		}
	}
	
    public List<Estado> findAll(){
    	return repo.findAll();
    }
}
