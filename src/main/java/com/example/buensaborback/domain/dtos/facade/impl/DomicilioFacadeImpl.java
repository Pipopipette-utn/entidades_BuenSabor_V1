package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.DomicilioDto;
import com.example.buensaborback.domain.dtos.domain.entities.Domicilio;
import com.example.buensaborback.domain.dtos.facade.IDomicilioFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import com.example.buensaborback.domain.dtos.services.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImpl extends BaseFacadeImpl<Domicilio, DomicilioDto,Long> implements IDomicilioFacade {
    public DomicilioFacadeImpl(IBaseService<Domicilio, Long> baseService, IBaseMapper<Domicilio, DomicilioDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IDomicilioService domicilioService;

    @Override
    public DomicilioDto asignarLocalidad(Long id, Long idLocalidad) {
        return baseMapper.toDTO(domicilioService.asignarLocalidad(id,idLocalidad));
    }
}
