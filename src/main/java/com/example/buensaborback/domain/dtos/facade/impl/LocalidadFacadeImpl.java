package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.LocalidadDto;
import com.example.buensaborback.domain.dtos.domain.entities.Localidad;
import com.example.buensaborback.domain.dtos.facade.ILocalidadFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import com.example.buensaborback.domain.dtos.services.ILocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadFacadeImpl extends BaseFacadeImpl<Localidad, LocalidadDto,Long> implements ILocalidadFacade {
    public LocalidadFacadeImpl(IBaseService<Localidad, Long> baseService, IBaseMapper<Localidad, LocalidadDto> baseMapper) {
        super(baseService, baseMapper);
    }
    @Autowired
    private ILocalidadService localidadService;

    @Override
    public LocalidadDto asignarProvincia(Long id, Long idProvincia) {
        return baseMapper.toDTO(localidadService.asignarProvincia(id,idProvincia));
    }

}
