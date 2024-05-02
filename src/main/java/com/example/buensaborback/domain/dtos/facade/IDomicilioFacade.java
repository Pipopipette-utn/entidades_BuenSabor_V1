package com.example.buensaborback.domain.dtos.facade;

import com.example.buensaborback.domain.dtos.domain.dtos.DomicilioDto;

public interface IDomicilioFacade extends IBaseFacade<DomicilioDto,Long> {
    DomicilioDto asignarLocalidad(Long id, Long idLocalidad);
}
