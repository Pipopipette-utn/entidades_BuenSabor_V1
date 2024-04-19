package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends IBaseRepository<Pedido,Long> {
}
