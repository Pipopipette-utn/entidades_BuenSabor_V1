package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.ProvinciaDto;
import com.example.buensaborback.domain.dtos.domain.entities.Provincia;
import com.example.buensaborback.domain.dtos.facade.IProvinciaFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import com.example.buensaborback.domain.dtos.services.IProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaFacadeImpl extends BaseFacadeImpl<Provincia, ProvinciaDto,Long> implements IProvinciaFacade {
    public ProvinciaFacadeImpl(IBaseService<Provincia, Long> baseService, IBaseMapper<Provincia, ProvinciaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public ProvinciaDto asignarPais(Long id, Long idPais) {
        return baseMapper.toDTO(provinciaService.asignarPais(id,idPais));
    }

}
