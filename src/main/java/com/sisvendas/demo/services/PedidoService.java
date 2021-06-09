package com.sisvendas.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sisvendas.demo.domain.Pedido;
import com.sisvendas.demo.repositories.PedidoRepository;
import com.sisvendas.demo.services.exceptions.DataIntegrityException;
import com.sisvendas.demo.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	@Autowired
	private PedidoRepository clienteRepository;
	
//	@Autowired
//	private EnderecoRepository enderecoRepository;
	
	
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

		
	@Transactional
	public Pedido insert(Pedido obj) {
		obj.setId(null);
		obj = repo.save(obj);
//		clienteRepository.saveAll(obj.getCliente());
		return obj;
	}
	
	

	public Pedido update(Pedido obj) {
		Pedido newObj = find(obj.getId());
//		updateData(newObj,obj);
		return obj = repo.save(obj);
	}
	
	private void updateData(Pedido newObj,Pedido obj) {
//		newObj.setNome(obj.getNome());
//		newObj.setEmail(obj.getEmail());
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir cliente porque há pedidos relacionadas");

		}
	}

	public List<Pedido> findAll() {
		return repo.findAll();
	}

	public Page<Pedido> findPage(Integer page, Integer linesPerPage, String direction,String orderBy) {

		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
//	public Pedido fromDTO(PedidoDTO objDTO) {
//		return new Pedido(objDTO.getId(),objDTO.getNome(),objDTO.getEmail(),null,null);
//	}
	
//	public Pedido fromDTO(PedidoNewDTO objDto) {
//		Pedido cli = new Pedido(null, objDto.getNome(), objDto.getEmail(), objDto.getCpfOuCnpj(), TipoPedido.toEnum(objDto.getTipo()));
//		Cidade cid = new Cidade(objDto.getCidadeId(), null, null);
//		Endereco end = new Endereco(null, objDto.getLogradouro(), objDto.getNumero(), objDto.getComplemento(), objDto.getBairro(), objDto.getCep(), cli, cid);
//		cli.getEnderecos().add(end);
//		cli.getTelefones().add(objDto.getTelefone1());
//		if (objDto.getTelefone2()!=null) {
//			cli.getTelefones().add(objDto.getTelefone2());
//		}
//		if (objDto.getTelefone3()!=null) {
//			cli.getTelefones().add(objDto.getTelefone3());
//		}
//		return cli;
//	}
//	
	

}
