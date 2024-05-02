package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.FacturaDto;
import com.example.buensaborback.domain.dtos.domain.entities.Factura;
import com.example.buensaborback.domain.dtos.facade.IFacturaFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import org.springframework.stereotype.Service;

@Service
public class FacturaFacadeImpl extends BaseFacadeImpl<Factura, FacturaDto,Long> implements IFacturaFacade {
    public FacturaFacadeImpl(IBaseService<Factura, Long> baseService, IBaseMapper<Factura, FacturaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
