package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.PaisDto;
import com.example.buensaborback.domain.dtos.domain.entities.Pais;
import com.example.buensaborback.domain.dtos.facade.IPaisFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import org.springframework.stereotype.Service;

@Service
public class PaisFacadeImpl extends BaseFacadeImpl<Pais, PaisDto,Long> implements IPaisFacade {

    public PaisFacadeImpl(IBaseService<Pais, Long> baseService, IBaseMapper<Pais, PaisDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
