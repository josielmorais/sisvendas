package com.sisvendas.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisvendas.demo.domain.Pedido;
import com.sisvendas.demo.repositories.PedidoRepository;
import com.sisvendas.demo.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		
		Pedido obj = repo.getOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
			+ ", Tipo: " + Pedido.class.getName());
			}
		return obj;
	}
	
	

}
