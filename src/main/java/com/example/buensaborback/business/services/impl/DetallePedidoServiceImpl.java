package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IDetallePedidoService;
import com.example.buensaborback.domain.entities.DetallePedido;
import com.example.buensaborback.repositories.BaseRepository;

public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido, Long> implements IDetallePedidoService {
    public DetallePedidoServiceImpl(BaseRepository<DetallePedido, Long> baseRepository) {
        super(baseRepository);
    }
}
