package com.sisvendas.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisvendas.demo.domain.Pedido;

@Repository 
public interface PedidoRepository extends JpaRepository <Pedido,Integer> {

}
