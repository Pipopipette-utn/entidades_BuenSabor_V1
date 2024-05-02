package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.ImagenDto;
import com.example.buensaborback.domain.dtos.domain.entities.Imagen;
import com.example.buensaborback.domain.dtos.facade.IImagenFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import org.springframework.stereotype.Service;

@Service
public class ImagenFacadeImpl extends BaseFacadeImpl<Imagen, ImagenDto,Long> implements IImagenFacade {
    public ImagenFacadeImpl(IBaseService<Imagen, Long> baseService, IBaseMapper<Imagen, ImagenDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
