package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.dtos.domain.entities.Sucursal;
import com.example.buensaborback.domain.dtos.facade.ISucursalFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import com.example.buensaborback.domain.dtos.services.ISucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalFacadeImpl extends BaseFacadeImpl<Sucursal, SucursalDto,Long> implements ISucursalFacade {
    public SucursalFacadeImpl(IBaseService<Sucursal, Long> baseService, IBaseMapper<Sucursal, SucursalDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private ISucursalService sucursalService;

    @Override
    public SucursalDto asignarDocimilio(Long id, Long idDomicilio) {
        return baseMapper.toDTO(sucursalService.asignarDomicilio(id,idDomicilio));
    }

    @Override
    public SucursalDto asignarCategorias(Long id, List<Long> categoriasIds) {
        return baseMapper.toDTO(sucursalService.asignarCategorias(id,categoriasIds));
    }

    @Override
    public SucursalDto removerCategorias(Long id, List<Long> categoriasIds) {
        return baseMapper.toDTO(sucursalService.removerCategorias(id,categoriasIds));
    }

    @Override
    public SucursalDto asignarPromociones(Long id, List<Long> promocionesIds) {
        return baseMapper.toDTO(sucursalService.asignarPromociones(id,promocionesIds));
    }

    @Override
    public SucursalDto removerPromociones(Long id, List<Long> promocionesIds) {
        return baseMapper.toDTO(sucursalService.removerPromociones(id,promocionesIds));
    }
}
