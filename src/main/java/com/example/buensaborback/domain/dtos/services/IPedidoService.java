package com.example.buensaborback.domain.dtos.services;

import com.example.buensaborback.domain.dtos.domain.entities.Pedido;


public interface IPedidoService extends IBaseService<Pedido,Long> {
    Pedido create(Pedido entity, Long domicilioId, Long sucursalId);
}
