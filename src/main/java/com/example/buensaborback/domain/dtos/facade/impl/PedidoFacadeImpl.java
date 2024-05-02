package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.PedidoDto;
import com.example.buensaborback.domain.dtos.domain.entities.Pedido;
import com.example.buensaborback.domain.dtos.facade.IPedidoFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import com.example.buensaborback.domain.dtos.services.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImpl extends BaseFacadeImpl<Pedido, PedidoDto,Long> implements IPedidoFacade {

    public PedidoFacadeImpl(IBaseService<Pedido, Long> baseService, IBaseMapper<Pedido, PedidoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IPedidoService pedidoService;

    @Override
    public PedidoDto createNew(PedidoDto request) {
        var entityToCreate = baseMapper.toEntity(request);
        var entityCreated = pedidoService.create(entityToCreate,request.getDomicilioId(),request.getSucursalId());
        return baseMapper.toDTO(entityCreated);
    }
}
