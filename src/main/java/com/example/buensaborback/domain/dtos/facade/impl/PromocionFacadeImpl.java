package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.PromocionDto;
import com.example.buensaborback.domain.dtos.domain.entities.Promocion;
import com.example.buensaborback.domain.dtos.facade.IPromocionFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import com.example.buensaborback.domain.dtos.services.IPromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionFacadeImpl extends BaseFacadeImpl<Promocion, PromocionDto, Long> implements IPromocionFacade {
    public PromocionFacadeImpl(IBaseService<Promocion, Long> baseService, IBaseMapper<Promocion, PromocionDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IPromocionService promocionService;

    @Override
    public PromocionDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(promocionService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public PromocionDto removerImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(promocionService.removerImagenes(id,imagenesIds));
    }
}
