package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.*;
import com.example.buensaborback.domain.entities.Pedido;
import com.example.buensaborback.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements IPedidoService {
    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository) {
        super(baseRepository);
    }
}
