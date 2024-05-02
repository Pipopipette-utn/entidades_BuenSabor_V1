package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.dtos.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.domain.dtos.facade.IArticuloManufacturadoFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IArticuloManufacturadoService;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoFacadeImpl extends BaseFacadeImpl<ArticuloManufacturado, ArticuloManufacturadoDto,Long> implements IArticuloManufacturadoFacade {
    public ArticuloManufacturadoFacadeImpl(IBaseService<ArticuloManufacturado, Long> baseService, IBaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IArticuloManufacturadoService articuloManufacturadoService;

    @Override
    public ArticuloManufacturadoDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(articuloManufacturadoService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloManufacturadoDto removerImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(articuloManufacturadoService.removerImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloManufacturadoDto asignarUnidadMedida(Long id, Long unidadMedidaId) {
        return baseMapper.toDTO(articuloManufacturadoService.asignarUnidadMedida(id,unidadMedidaId));
    }
}
